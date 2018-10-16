
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.ULocale;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
public class datePicker {
private ULocale locale = new ULocale("fa_IR@calendar=persian");
private Calendar calendar = Calendar.getInstance(locale);
JLabel l = new JLabel("", JLabel.CENTER);
String day = "";
JDialog d;
private Date nowDate = null; //current date
JButton[] button = new JButton[49];
public datePicker(JFrame parent) {
d = new JDialog();
d.setModal(true);
String[] header = { "شنبه", "یکشنبه", "دوشنبه", "سه شنبه", "چهارشنبه", "پنجشنبه", "جمعه" };
JPanel p0 = new JPanel(new GridLayout(1, 20));
JPanel p1 = new JPanel(new GridLayout(7, 7));
p0.setPreferredSize(new Dimension(20, 20));
p1.setPreferredSize(new Dimension(430, 120));
p0.applyComponentOrientation(
ComponentOrientation.RIGHT_TO_LEFT);
p1.applyComponentOrientation(
ComponentOrientation.RIGHT_TO_LEFT);
for (int x = 0; x < button.length; x++) {
final int selection = x;
button[x] = new JButton();
button[x].setFocusPainted(false);
button[x].setBackground(Color.white);
button[x].addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
day = button[selection].getActionCommand();
d.dispose();
}
});
if (x < 7) {
p0.add(new JLabel(header[x],JLabel.CENTER));
}
p1.add(button[x]);
}
JPanel p2 = new JPanel(new GridLayout(1, 3));
JButton previous = new JButton();
previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainSource/images/back.png")));
previous.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
moveTo(calendar.MONTH, 1);
}
});
p2.add(previous);
p2.add(l);
JButton next = new JButton();
next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainSource/images/next.png")));
next.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
moveTo(calendar.MONTH, -1);
}
});
p2.add(next);
d.add(p0, BorderLayout.NORTH);
d.add(p1, BorderLayout.CENTER);
d.add(p2, BorderLayout.SOUTH);
d.pack();
d.setLocationRelativeTo(parent);
Calendar now = Calendar.getInstance(locale); //
nowDate = new Date(now.getTimeInMillis());
d.setTitle("تقویم شمسی");
displayDate(now);
d.setVisible(true);
}

public String setPickedDate() {
if (day.equals(""))
return day;
int month= calendar.get(calendar.MONTH)+1;
int year = calendar.get(calendar.YEAR);
String date = l.getText()+"/"+day;
return date;
}

private void displayDate(Calendar now) {
int currentDay = now.get(calendar.DATE);
now.add(calendar.DAY_OF_MONTH, -(now.get(calendar.DATE) - 1)); //
int startIndex = now.get(calendar.DAY_OF_WEEK); //
int year = now.get(calendar.YEAR); //
int month = now.get(calendar.MONTH) + 1; //
int lastDay = this.getLastDayOfMonth(year, month); //
int endIndex = startIndex + lastDay - 1; //
int startday = 1;
for (int x = 0; x < button.length; x++)
button[x].setText("");
for (int i = 0; i < button.length; i++) {
Color temp = button[i].getBackground();
if (temp.equals(Color.BLUE)) {
button[i].setBackground(Color.white);
}
}

for (int i = startIndex; i < button.length; i++) {
if (i >= startIndex && i <= endIndex) {
button[i].setText("" + startday);
if (startday == currentDay) {
button[i].setBackground(Color.BLUE);
}

l.setText(Integer.toString(year) + "/" + Integer.toString(month));
startday++;
} else {
button[i].setText("");
}
}

}
private int getLastDayOfMonth(int year, int month) {
if (month == 1 ||
month == 2 ||
month == 3 ||
month == 4 ||
month == 5 ||
month == 6 ) {
return 31;
}
if (month == 7 ||
month == 8 ||
month == 9 ||
month == 10 ||
month == 11 ) {
return 30;
}
if (month == 12) {
if (isLeapYear(year)) {
return 29;
} else {
return 29;
}
}
return 0;
}
public boolean isLeapYear(int year) {
return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}
private void moveTo(int type, int value) {
Calendar now = Calendar.getInstance(locale);
now.setTime(nowDate);
now.add(type, value);
nowDate = new Date(now.getTimeInMillis());
int month= now.get(calendar.MONTH)+1;
int year = now.get(calendar.YEAR);
displayDate(now);
}

public static void main(String[] args) {
try {
javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");

} catch (Exception e) {
}

}
}


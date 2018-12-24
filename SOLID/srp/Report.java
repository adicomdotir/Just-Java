public class Report
{
    public String getTitle() {
        return 'Report Title';
    }

    public String getDate() {
        return '2000-04-21';
    }

    public Map<String, String> getContents() {
    	Map<String, String> map = new HashMap<>();
    	map.put("tilte", getTitle());
    	map.put("date", getDate());
        return map;
    }

    public function formatJson()
    {
        return json_encode($this->getContents());
    }
}
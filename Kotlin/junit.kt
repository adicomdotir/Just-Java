 import org.junit.Assert
import org.junit.Test

class TestKotlin {
    @Test
    fun testOne() {
        val primeFactors = PrimeFactors()
        Assert.assertEquals(emptyList<Int>(), primeFactors.generate(1))
    }

    @Test
    fun testTwo() {
        val primeFactors = PrimeFactors()
        Assert.assertEquals(listOf(2), primeFactors.generate(2))
    }

    @Test
    fun testThree() {
        val primeFactors = PrimeFactors()
        Assert.assertEquals(listOf(3), primeFactors.generate(3))
    }

    @Test
    fun testFour() {
        val primeFactors = PrimeFactors()
        Assert.assertEquals(listOf(2, 2), primeFactors.generate(4))
    }

    @Test
    fun testFive() {
        val primeFactors = PrimeFactors()
        Assert.assertEquals(listOf(5), primeFactors.generate(5))
    }

    @Test
    fun testSix() {
        val primeFactors = PrimeFactors()
        Assert.assertEquals(listOf(2, 3), primeFactors.generate(6))
    }

    @Test
    fun testEight() {
        val primeFactors = PrimeFactors()
        Assert.assertEquals(listOf(2, 2, 2), primeFactors.generate(8))
    }

    @Test
    fun testNine() {
        val primeFactors = PrimeFactors()
        Assert.assertEquals(listOf(3, 3), primeFactors.generate(9))
    }

    @Test
    fun testExtra() {
        val primeFactors = PrimeFactors()
        Assert.assertEquals(listOf(3, 5, 7, 11, 13), primeFactors.generate(3 * 5 * 7 * 11 * 13))
    }
}

class PrimeFactors {
    fun generate(x: Int): List<Int> {
        var num = x
        val tmp = mutableListOf<Int>()
        var counter = 2
        while (num > 1) {
            while (num % counter == 0) {
                tmp.add(counter)
                num /= counter
            }
            counter++
        }
        return tmp
    }
}

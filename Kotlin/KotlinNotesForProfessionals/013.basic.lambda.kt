fun main(args: Array<String>) {
    val user1 = User(10)
    val user2 = User(15)
    val user3 = User(20)
    val user4 = User(25)
    val list = listOf<User>(user1, user2, user3, user4)

    val allowedAge = { user: User -> user.age > 18 }
    print(list.filter(allowedAge))
}

data class User(val age: Int)

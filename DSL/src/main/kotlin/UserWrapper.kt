/**
 * Created by tony on 2018/9/20.
 */
class UserWrapper{

    private val address = Address()

    var name:String?=null
    var password: String?=null

    fun address(init: Address.() -> Unit):Address { // 类似于 apply 函数，返回 address 对象本身

        address.init()
        return address
    }

    internal fun getAddress() = address
}

fun user(init: UserWrapper.() -> Unit):User {

    val wrapper = UserWrapper()
    wrapper.init()

    val user = User()

    user.name = wrapper.name
    user.password = wrapper.password
    user.addresses = wrapper.getAddress()

    return user
}


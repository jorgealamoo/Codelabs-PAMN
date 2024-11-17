fun main() {
    val myFoldablePhone = FoldablePhone()

    myFoldablePhone.checkPhoneScreenLight()

    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight()

    myFoldablePhone.unFold()
    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight()

    myFoldablePhone.fold()
    myFoldablePhone.checkPhoneScreenLight()

    myFoldablePhone.unFold()
    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight()
    myFoldablePhone.switchOff()
    myFoldablePhone.checkPhoneScreenLight()
}

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true) : Phone(isScreenLightOn = false) {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isScreenLightOn = false
        isFolded = true
    }

    fun unFold() {
        isFolded = false
    }
}
package md.endava.internship.kotlinpractice

class MainActivityProvider(var view : View) {

    private var model : LemonModel = LemonModel()
    fun nextStage() : Int {

        if(model.stage == 4){
            model.stage = 1
            view.showSnackBar(model.count++)
        } else {
            model.stage += 1
        }
        view.scaleAnimation()


        return model.stage
    }

    fun canGoNext() : Boolean = model.canGoNext

    fun updateGoNextState(new_state : Boolean) {
        model.canGoNext = new_state
    }

    public interface View{

        fun updateData(message : String, id : Int)
        fun update(stage : Int)
        fun showSnackBar(count : Int)
        fun scaleAnimation()
    }
}
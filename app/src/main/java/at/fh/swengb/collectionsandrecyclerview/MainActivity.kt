package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf<Student>(Student("Rob", 27), Student("George", 27), Student("Lisa", 25))
        Log.e("Student", list[2].name)


        val list2 = mutableListOf<Student>(Student("Rob", 27), Student("George", 27), Student("Lisa", 25),Student("George2", 77), Student("Lisa2", 55))
        list2[3] = Student("albert", 30)

        Log.e("Student", list2[3].name)

        list2.add(Student("addSt", 222))

        for (i in 0..list2.size-1) {
            Log.e("Set", list2[i].name)
        }



        val set = setOf<Student>(Student("Rob", 27), Student("Rob", 27), Student("Lisa", 25))
        for (i in 0..set.size-1) {
            Log.e("Student", set.elementAt(i).name.toString())
        }

        val set2 = mutableSetOf<Student>(Student("Rob", 27), Student("George", 27), Student("Lisa", 25),Student("George2", 77), Student("Lisa2", 55))

        set2.add(Student("Rob", 27))
        set2.add(Student("Rodsdsb", 3222))

        for (i in 0..set2.size-1) {
            Log.e("Set2", set2.elementAt(i).name + " sem: " + set2.elementAt(i).currentSemester.toString())
        }

        for (i in 0..set2.size-1) {
            if(set2.elementAt(i).name == "Rob")
                Log.e("Set3", set2.elementAt(i).name + " sem: " + set2.elementAt(i).currentSemester.toString())
        }




        val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
        val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
        val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)

    }
}

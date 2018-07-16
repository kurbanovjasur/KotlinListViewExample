# Simple Kotlin ListView Example

This is what you get at the end of this example.

![default](https://user-images.githubusercontent.com/41279178/42759780-9fa5961c-8921-11e8-8a9e-cc270fcae53d.PNG)


### activity_main.xml
First add ListView in your main xml file
```
  <ListView
        android:id="@+id/listView"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    </ListView>
```

### MainActivity.kt
In your MainActivity first define ListView
```
lateinit var listView: ListView
```
Next in your onCreate method initatlize listview 
```
listView = findViewById(R.id.listView)
```
Add array of items which you want to display  on list view. In this example, I create array of footbal clubs
```
 val clubs = arrayOf("Arsenal",
                            "Aston Villa",
                            "Chelsea",
                            "Everton",
                            "Fulham",
                            "Hull City",
                            "Ipswich Town",
                            "Manchester United",
                            "Manchester City",
                            "Stoke City",
                            "Southampton",
                            "Sunderland",
                            "West Ham United",
                            "Arsenal",
                            "Aston Villa",
                            "Chelsea",
                            "Everton",
                            "Fulham",
                            "Hull City",
                            "Ipswich Town",
                            "Manchester United",
                            "Manchester City")
  ```
  Once you finished with creating arrays, setup adapter in order to show array items on ListView 
 ```
 listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, clubs)
 ```
 ### We are done! Enjoy!

# Experiment 6: Android Application Using Basic Views

## Student Details

**Name:** Sahil
**USN:** 25MCAR0117
**Course:** MCA

---

## Aim

To develop an Android application using basic Android Views such as TextView, EditText, Button, Spinner, RadioButton, CheckBox, and ScrollView.

---

## Objective

The objective of this experiment is to understand and implement traditional Android UI components using XML layouts and Kotlin programming.

The application demonstrates a simple Student Registration form where the user can enter personal and academic details and submit the information.

---

## Concept and Technology Used

This experiment uses the traditional Android Views framework.

### Technologies

* Android Studio
* Kotlin
* XML
* Android SDK
* Android Views

### Basic Views Used

| View         | Purpose                                       |
| ------------ | --------------------------------------------- |
| TextView     | Displays text and labels                      |
| EditText     | Accepts user input                            |
| Button       | Performs actions                              |
| Spinner      | Provides a dropdown list                      |
| RadioButton  | Allows selection of one option                |
| CheckBox     | Allows the user to select or accept an option |
| ScrollView   | Makes the content scrollable                  |
| LinearLayout | Arranges UI components vertically             |

---

## Scenario

A Student Registration application is developed to demonstrate the use of basic Android Views.

The user can:

1. Enter their name.
2. Enter their USN.
3. Select a course.
4. Select their gender.
5. Accept the terms and conditions.
6. Submit the registration form.
7. View the entered details.
8. Clear the form using the Clear button.

The application also performs basic input validation before displaying the registration result.

---

## Application Features

* Student name input
* USN input
* Course selection
* Gender selection
* Terms and conditions checkbox
* Form validation
* Registration success message
* Clear button
* Scrollable user interface

---

## Project Structure

```text
EX6/
│
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/
│   │       │       └── example/
│   │       │           └── ex6/
│   │       │               └── MainActivity.kt
│   │       │
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   │
│   │       │   ├── drawable/
│   │       │   │
│   │       │   ├── mipmap/
│   │       │   │
│   │       │   └── values/
│   │       │       ├── colors.xml
│   │       │       ├── strings.xml
│   │       │       └── themes.xml
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle.kts
│
├── gradle/
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

## Main Components

### MainActivity.kt

`MainActivity.kt` contains the application logic. It connects the XML Views using `findViewById()` and handles button clicks, input validation, course selection, gender selection, and displaying the registration result.

### activity_main.xml

`activity_main.xml` defines the user interface using traditional Android XML Views.

---

## Validation

The application validates the following conditions:

* Name must not be empty.
* USN must not be empty.
* A course must be selected.
* Gender must be selected.
* Terms and conditions must be accepted.

If any required field is missing, an appropriate error message or Toast message is displayed.

---

# Test Cases

## Test Case 1: Successful Registration

### Input

```text
Name: Sahil
USN: 25MCAR0117
Course: MCA
Gender: Male
Terms: Accepted
```

### Expected Result

The application displays:

```text
Registration Successful

Name: Sahil
USN: 25MCAR0117
Course: MCA
Gender: Male
```

### Screenshot

Add your screenshot below:

```text
![Test Case 1 - Successful Registration](screenshots/test_case_1.png)
```

---

## Test Case 2: Empty Name

### Input

```text
Name: Empty
USN: 25MCAR0117
Course: MCA
Gender: Male
Terms: Accepted
```

### Expected Result

The application displays an error asking the user to enter their name.

```text
Enter your name
```

### Screenshot

Add your screenshot below:

```text
![Test Case 2 - Empty Name](screenshots/test_case_2.png)
```

---

## Test Case 3: Terms and Conditions Not Accepted

### Input

```text
Name: Sahil
USN: 25MCAR0117
Course: MCA
Gender: Male
Terms: Not Accepted
```

### Expected Result

The application displays a Toast message:

```text
Please accept the terms
```

### Screenshot

Add your screenshot below:

```text
![Test Case 3 - Terms Not Accepted](screenshots/test_case_3.png)
```

---

# Output Screenshot

Add the main application output screenshot below:

```text
![Application Output](screenshots/output.png)
```

---

# How to Run the Application

1. Open Android Studio.
2. Open the `EX6` project.
3. Allow Gradle to sync completely.
4. Connect an Android device or start an Android Emulator.
5. Click the **Run** button.
6. Select the connected device or emulator.
7. The Student Registration application will launch.

---

# Result

The Android application was successfully developed using basic Android Views. The application demonstrates the use of TextView, EditText, Button, Spinner, RadioButton, CheckBox, LinearLayout, and ScrollView with Kotlin and XML.

---

## Conclusion

This experiment provides an understanding of traditional Android UI development using XML layouts and Kotlin. The Student Registration application demonstrates how different basic Views can be combined to create an interactive Android application with input handling and validation.

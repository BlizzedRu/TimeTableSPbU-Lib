# TimeTable SPbU Java Library

Simple Java library for [timetable](https://https://timetable.spbu.ru) of Saint Petersburg State University

**TimeTableSPbU-Lib** provides easy access to all available methods of [TimeTable API](https://timetable.spbu.ru/help/ui/index). 
Can be useful for grabbing data of addresses, events, student groups and schedules, of course.

* Contains Java object wrappers for any API response
* Convenient request builders

## Installing

#### Maven

In your pom.xml inside the *\<dependencies>* tag
```xml
<dependencies>
    ...
    <dependency>
        <groupId>ru.blizzed</groupId>
        <artifactId>timetablespbu-lib</artifactId>
        <version>1.0.1</version>
    </dependency>
</dependencies>
```

#### Gradle

In your build.gradle file inside the *dependencies* section

* Gradle 3.0 and above
``` 
dependencies {
   ...
   implementation 'ru.blizzed:timetablespbu-lib:1.0.1'
}
```
  
* Below 3.0
``` 
dependencies {
    ...
    compile 'ru.blizzed:timetablespbu-lib:1.0.1'
}
```
  
## Usage

#### Initialization

You don't need to initialize this library.

#### Building and executing requests

All methods of SPbU TimeTable API are available in `TimeTableApi` class. 
There you can find self-titled methods of API sections.

Imagine that you need to look over all addresses belong to Saint Petersburg State University.

```java 
TimeTableApi.addresses()
        .getAll()
        .execute()
        .forEach(System.out::println);
```

A few months later you have entered the SPbU as student and you want to learn how much
lessons per week you have. Let's do!
```java 
int groupId = 14887;    // You've learnt before
int sum = TimeTableApi.groups().getEvents(groupId)
        .execute()
        .getDays()
        .stream()
        .mapToInt(d -> d.getDayEvents().size())
        .sum();
```

#### Callbacks 
You can receive callbacks in two ways:

* Catching exceptions
```java 
try {
    TimeTableApi.divisions().getAll().execute().forEach(System.out::println);
} catch (ApiCallException | ApiErrorException e) {
    // Handle error
} 
```
* With listener
```java 
TimeTableApi.divisions().getAll().execute(new ApiCaller.Listener<List<StudyDivision>>() {
    @Override
    public void onComplete(List<StudyDivision> result, ApiCaller<List<StudyDivision>> apiCaller) {
    }
    @Override
    public void onError(ApiError error, ApiCaller<List<StudyDivision>> apiCaller) {
        /* This method triggers you when API has been called but response contains an error */
        // Handle Api Error
    }
    @Override
    public void onFailure(ApiCallException e, ApiCaller<List<StudyDivision>> apiCaller) {
        /* This method triggers you when call to API cannot be established. E.g. no internet connection */
        // Handle Failure
    }
});
```
**Tip:** you can override not all callback methods

#### Requests cancelling
It goes without saying that you can also cancel request immediately if needs
```java 
caller.cancel();
```

## License

```
Copyright (c) 2017 BlizzedRu (Ivan Vlasov)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


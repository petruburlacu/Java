 static String[] reformatDate(String[] dates) {

        String[] days = {"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th","13th","14th","15th",
                     "16th","17th","18th","19th","20th","21st","22nd","23rd","24th","25th","26th","27th","28th","29th","30th","31st"};
    
        String[] months = {"Jan","Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        for (int i = 0; i < dates.length; i ++) {
            String s = dates[i];
            String[] newDates = s.split(" ");
            
            
            //dates index 0 represents days
            //dates index 1 represents month
            //dates index 2 represents year
            int day = Arrays.asList(days).indexOf(newDates[0]) +1;
            int month = Arrays.asList(months).indexOf(newDates[1]) +1;

            String dayString;
            String monthString;

            if (day < 10) {
                dayString = "0" + day; //if one digit day add 0 prefix to follow the requirements
            }
            else {
                dayString= "" + day; //for parsing purposes
            }

            if (month < 10) {
                monthString = "0" + month;
            }
            else {
                monthString = "" + month;
            }
            String formated = newDates[2] + "-" + monthString + "-" +dayString;
            dates[i]= formated;
        }
        
        return dates;
        
    }

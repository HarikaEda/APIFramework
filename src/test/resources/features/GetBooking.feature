Feature: Getting endpoint test scenarios
     #@regression yapatığımız zaman sadece regression olanlar çalışır..
     #@smoke yapatığımız zaman sadece smoke olanlar çalışır..
     #mesela @Booking yaparsak booking ile alakalı endpointler çalışır..(request bazında)
  Scenario: User should see valid response when user sends valid id
    # kullanıcı geçerli bir id girdiğide getpoint endpointimiz bize geçerli bir respons döndürmeli
   Given  User sets the "bookingId" path as 1
   When  User sends a request to "/booking/{bookingId}
   Then User should see expected booking record

  Scenario: User should see invalid response when user sends id as String

   #  When User gets booking {int}
const form = document.querySelector('form')

form.addEventListener('submit', function(e){
    e.preventDefault() // This is to prevent the default 'form' function.

   const height = parseInt(document.querySelector("#height").value)
   const weight = parseInt(document.querySelector("#weight").value)
   const results = document.querySelector("#results")
   const category = document.querySelector("#bmi-category")

   if (height === '' || height < 0 || isNaN(height)) {
    results.innerHTML = `Please enter valid height ${height}`
   }
   else if (weight === '' || weight < 0 || isNaN(weight)) {
    results.innerHTML = `Please enter valid weight ${weight}`
   }

    const bmi = (weight / ((height * height) / 10000)).toFixed(2); //Formula
    results.innerHTML = `<span>${bmi}</span>`

   let bmiCategory = ''

   if (bmi < 18.6) {
    bmiCategory = 'Under Weight'
   }

   else if (bmi >= 18.6 && bmi <= 24.9){
    bmiCategory = 'Normal Weight'
   }

   else{
    bmiCategory = 'Over Weight'
   }

   category.innerHTML = `<span>${bmiCategory}</span>` 
})
const animalTypeOption = document.getElementById("animalTypeOption");
const chippedOption = document.getElementById("chippedOption");
const vaccinatedOption = document.getElementById("vaccinatedOption");
const childFriendlyOption = document.getElementById("childFriendlyOption");
const isSterilizedOption = document.getElementById("isSterilizedOption");
const isFemaleOption = document.getElementById("isFemaleOption");
// const isActiveOption = document.getElementById("isActiveOption");

animalTypeOption.value = "DOG";
chippedOption.value = true;
vaccinatedOption.value = true;
childFriendlyOption.value = true;
isSterilizedOption.value = true;
isFemaleOption.value = true;
// isActiveOption.value = true;


function editImgClass(item){
    item.className = "optionImg imgOption";
}

// SELLER OPTIONS
const dog = document.getElementById("DOG");
const cat = document.getElementById("CAT");
const animalOption = document.getElementById("animalOption");

animalOption.addEventListener("click", (event) => {
    const type = event.target.id;
    animalTypeOption.value = type;
});

dog.addEventListener("click", (event) => {
    event.target.className = "optionImg imgActiveOption";
    event.target.src = "image/dogIcon.png";
    cat.src = "image/catIconGrey.png";
    editImgClass(cat);
});

cat.addEventListener("click", (event) => {
    event.target.className = "optionImg imgActiveOption";
    event.target.src = "image/catIcon.png";
    dog.src = "image/dogIconGrey.png";
    editImgClass(dog);
});


// Chipped
const yesChipped = document.getElementById("yesChipped");
const noChipped = document.getElementById("noChipped");

yesChipped.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    chippedOption.value = true;
    noChipped.className = "option";
});

noChipped.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    chippedOption.value = false;
    yesChipped.className = "option";
});

// Vaccinated
const yesVaccinated = document.getElementById("yesVaccinated");
const noVaccinated = document.getElementById("noVaccinated");

yesVaccinated.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    vaccinatedOption.value = true;
    noVaccinated.className = "option";
});

noVaccinated.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    vaccinatedOption.value = false;
    yesVaccinated.className = "option";
});

// Childfriendly
const yesChildfriendly = document.getElementById("yesChildfriendly");
const noChildfriendly = document.getElementById("noChildfriendly");

yesChildfriendly.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    childFriendlyOption.value = true;
    noChildfriendly.className = "option";
});

noChildfriendly.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    childFriendlyOption.value = false;
    yesChildfriendly.className = "option";
});

// Sterilized
const yesSterilized = document.getElementById("yesSterilized");
const noSterilized = document.getElementById("noSterilized");

yesSterilized.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    isSterilizedOption.value = true;
    noSterilized.className = "option";
});

noSterilized.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    isSterilizedOption.value = false;
    yesSterilized.className = "option";
});

// Gender
const female = document.getElementById("female");
const male = document.getElementById("male");

female.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    isFemaleOption.value = true;
    male.className = "option";
});

male.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    isFemaleOption.value = false;
    female.className = "option";
});
//
// // Active
// const yesActive = document.getElementById("yesActive");
// const noActive = document.getElementById("noActive");
//
// yesActive.addEventListener("click", (event) => {
//     event.target.className = "activeOption";
//     isActiveOption.value = true;
//     noActive.className = "option";
// });
//
// noActive.addEventListener("click", (event) => {
//     event.target.className = "activeOption";
//     isActiveOption.value = false;
//     yesActive.className = "option";
// });
//

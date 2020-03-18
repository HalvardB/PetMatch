const userTypeOption = document.getElementById("userTypeOption");
const animalTypeOption = document.getElementById("animalTypeOption");
const homeTypeOption = document.getElementById("homeTypeOption");
const previousAnimalOption = document.getElementById("previousAnimalOption");
const hasChildrenOption = document.getElementById("hasChildrenOption");
const genderOption = document.getElementById("genderOption");
const chippedOption = document.getElementById("chippedOption");
const vaccinatedOption = document.getElementById("vaccinatedOption");
const childFriendlyOption = document.getElementById("childFriendlyOption");
const isSterilizedOption = document.getElementById("isSterilizedOption");

function editTextClass(item){
    item.className = "option";
}

function editImgClass(item){
    item.className = "optionImg option";
}

function changeFormValues(item, value) {
    item.value = value;
}

const buyer = document.getElementById("buyer");
const seller = document.getElementById("seller");
const buyerOptions = document.getElementById("buyerOptions");
const sellerOptions = document.getElementById("sellerOptions");

buyer.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    buyerOptions.className = "showOptions";
    sellerOptions.className = "hideOptions";
    editTextClass(seller);
    changeFormValues(userTypeOption, "BUYER");
});

seller.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    buyerOptions.className = "hideOptions";
    sellerOptions.className = "showOptions";
    editTextClass(buyer);
    changeFormValues(userTypeOption, "SELLER");
});

const dog = document.getElementById("dog");
const cat = document.getElementById("cat");

dog.addEventListener("click", (event) => {
    event.target.className = "optionImg activeOption";
    event.target.src = "image/dogIcon.png";
    cat.src = "image/catIconGrey.png";
    editImgClass(cat);
});

cat.addEventListener("click", (event) => {
    event.target.className = "optionImg activeOption";
    event.target.src = "image/catIcon.png";
    dog.src = "image/dogIconGrey.png";
    editImgClass(dog);
});

function addEvent(idName1, idName2){
    const const1 = document.getElementById(idName1);
    const const2 = document.getElementById(idName2);

    const1.addEventListener("click", (event) => {
        event.target.className = "activeOption";
        editTextClass(const2);
    });

    const2.addEventListener("click", (event) => {
        event.target.className = "activeOption";
        editTextClass(const1);
    });
}

addEvent("femaleSeller", "maleSeller");
addEvent("yesSterilized", "noSterilized");
addEvent("yesChildfriendly", "noChildfriendly");
addEvent("yesVaccinated", "noVaccinated");
addEvent("yesChipped", "noChipped");
addEvent("apartment", "house");
addEvent("yesPrevious", "noPrevious");
addEvent("yesChildren", "noChildren");
addEvent("femaleBuyer", "maleBuyer");


// SELLER OPTIONS
const dogSeller = document.getElementById("dogSeller");
const catSeller = document.getElementById("catSeller");

dogSeller.addEventListener("click", (event) => {
    event.target.className = "optionImg activeOption";
    event.target.src = "image/dogIcon.png";
    catSeller.src = "image/catIconGrey.png";
    editImgClass(catSeller);
});

catSeller.addEventListener("click", (event) => {
    event.target.className = "optionImg activeOption";
    event.target.src = "image/catIcon.png";
    dogSeller.src = "image/dogIconGrey.png";
    editImgClass(dogSeller);
});
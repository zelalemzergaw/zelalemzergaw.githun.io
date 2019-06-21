$(function () {
    "use strict";
    $('#btnRemove').click(removeProduct);

    function removeProduct() {
      //  let removeItem=[];
        $('.check:checked'.each(function (index) {
            let id= parseInt($(index).val());
            let product={};
            product.id=id;
            product.qty=0;
            $.post("shopping-cart/remove",{products:JSON.stringify(product)},displayCart,"json");
        }))

        function displayCart(data) {
            $('#item_'+JSON.parse(data).id).remove();
        }

// if(removeItem.length>0){
        //     $.post("shopping-cart/remove",{products:JSON.stringify(removeItem)},displayCart,"json");
        // }
    }



})
var mostCommonWord = function(paragraph, banned) {
    let words = paragraph.toLowerCase().split(" ");
    let unbannedwords = words.filter((word)=> word !== banned[0] );
    let map = {};
    console.log(unbannedwords)
    for (let i = 0; i < unbannedwords.length; i++) {
        count = 0;
        for (let j = i + 1; j < unbannedwords.length; j++) {
            if (unbannedwords[i] === unbannedwords[j]) {
                count++;
                map[unbannedwords[i]] = count; 
            }
        }
    }
    console.log(map)
    let obj = Object.values(map)
    let max = Math.max(...obj);
    
    function getKeyByValue(object, value) {
        return Object.keys(object).find(key => object[key] === value);
    }

    return getKeyByValue(map, max);
}

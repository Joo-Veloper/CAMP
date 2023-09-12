# Java-Scrrpt


<img src = "https://github.com/Joo-Veloper/Java-Scrrpt/assets/134623719/6b092ac1-0002-4b70-9915-756187f1c761" width="400" height="400"/>

<img src = "https://github.com/Joo-Veloper/Java-Scrrpt/assets/134623719/ef94801d-db24-442e-b869-45f7afac4f98" width="400" height="400"/>

#### TIL
`checkResult()`라는 JavaScript 함수입니다. 이 함수는 jQuery를 사용하여 HTML 요소를 조작하여 사람들의 이름과 키에 관한 정보를 표시하는 것을 목적으로 하는 것 입니다. 
1. 코드는 `people`이라는 배열을 초기화합니다. 이 배열은 각각 사람을 나타내는 객체를 포함하고 있습니다. 각 사람 객체는 `name`과 `height` 속성을 가지고 있습니다.
2. `$('#q2').empty();`라는 줄은 ID가 `q2`인 HTML 요소를 선택하고 해당 내용을 비웁니다. 이전 내용을 지우고 새로운 정보를 추가하기 전에 이전 내용을 지우기 위해 사용될 것입니다.
3. 그런 다음 코드는 `forEach` 메서드를 사용하여 `people` 배열의 각 사람 객체를 반복 처리합니다.
4. `forEach` 루프 내부에서는 객체 분해를 사용하여 사람의 `name`과 `height` 속성을 가져옵니다. 이 정보를 사용하여 `${name}는 ${height}cm 입니다.`와 같은 형식의 HTML 문자열을 만듭니다.
5. 그 후에 생성된 HTML 문자열을 `$('#q2').append(temp_html);`을 통해 ID가 `q2`인 요소에 추가합니다. 따라서 각 사람의 이름과 키 정보가 해당 요소에 표시됩니다.
즉, 이 함수는 `people` 배열에 있는 사람들의 이름과 키 정보를 HTML 요소에 표시하는 역할을 합니다.

### Code
    <!DOCTYPE html>
      <html>
      
      <head>
          <title>자바스크립트 문법 연습하기!</title>
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
      </head>
      <script>
          function checkResult() {
              // let fruits = ['사과', '배', '감', '귤', '수박']
      
              // let people = [
              //     { 'name': '서영', 'age': 24 },
              //     { 'name': '현아', 'age': 30 },
              //     { 'name': '영환', 'age': 12 },
              //     { 'name': '서연', 'age': 15 },
              //     { 'name': '지용', 'age': 18 },
              //     { 'name': '예지', 'age': 36 }
              // ]
              let people = [
                  { 'name': '서영', 'height': 165 },
                  { 'name': '현아', 'height': 170 },
                  { 'name': '영환', 'height': 175 },
                  { 'name': '서연', 'height': 162 },
                  { 'name': '지용', 'height': 190 },
                  { 'name': '예지', 'height': 168 }
              ]
              $('#q2').empty();
      
              people.forEach(a => {
                  let name = a['name'];
                  let height = a['height'];
                  let temp_html = `<p>${name}는 ${height}cm 입니다.</p>`;
                  $('#q2').append(temp_html);
              });
      
          }
      </script>
      
      <body>
          <div class="top-part">
              <h1>자바스크립트 문법 연습하기!</h1>
          </div>
          <hr />
          <br>
          <h2>1. 함수</h2>
          <div class="button-part">
              <button onclick="checkResult()">결과 확인하기!</button>
          </div>
          <div class="list-part">
              <h2>2. 붙이기</h2>
              <div id="q1">
                  <p>사과</p>
                  <p>귤</p>
                  <p>감</p>
              </div>
          </div>
          <div class="list-part">
              <h2>3. 붙이기</h2>
              <div id="q2">
                  <p>영수는 24살입니다.</p>
                  <p>세종은 30살입니다.</p>
                  <p>수영은 20살입니다.</p>
              </div>
          </div>
      </body>
      
      </html>

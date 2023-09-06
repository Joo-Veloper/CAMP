# LOGIN

<div>
  <img src="https://github.com/Joo-Veloper/LOGIN/assets/134623719/69940948-c333-451b-8f73-42e532c8b484">

        
### 코드분석
     
      <!DOCTYPE html>
HTML5 문서 형식 선언으로, 이 문서가 HTML5로 작성되었음을 나타냅니다.
      
      <html lang="en">
HTML 문서의 시작 태그로, lang 속성은 문서가 영어로 작성

      <head>
문서에 대한 메타데이터를 포함하며, 문자 인코딩, 뷰포트 설정 및 문서 제목을 지정합니다.

          <meta charset="UTF-8">
문자 인코딩을 UTF-8로 설정하며, 다양한 언어로 텍스트를 표시하기 위한 널리 사용되는 인코딩입니다.

          <meta name="viewport" content="width=device-width, initial-scale=1.0">
뷰포트 설정으로, 페이지의 너비를 기기의 너비에 맞게 조정하고 초기 줌 레벨을 1.0으로 설정하여 반응형 디자인을 지원합니다.

          <title>Document</title>
문서 제목 설정
        
          <style>
CSS를 사용하여 HTML요소에 스타일을 적용하는 부분입니다.
          
              @font-face {
사용자 정의 폰트를 정의하고, 해당 폰트의 소스 URL, 무게, 스타일을 지정합니다.
              
                  font-family: 'HakgyoansimGaeulsopungB';
                  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2307-      
                  2@1.0/HakgyoansimGaeulsopungB.woff2') format('woff2');
                  font-weight: 700;
                  font-style: normal;
              }
              * {
                  font-family: 'HakgyoansimGaeulsopungB';
              }
사용자 정의 폰트를 정의하고, 해당 폰트의 소스 URL, 무게, 스타일 지정합니다.
              
                .mytitle {
                  width: 300px;
                  height: 200px;
                  /* background-color: green; */
      
                  color: white;
                  text-align: center;
                  padding-top: 30px;
                  border-radius: 8px;
                  background-image:         
                  url('https://www.catjoa.com:444/dog_sale/photo_
                 free/202101/1611101631_16337300.jpg ');
                  background-position: center;
                  background-size: cover;
              }
`.mytitle` : mytitle 클래스에 대한 스타일을 정의하며, 폭,높이, 텍스트 색상, 배경 이미지 및 기타 스타일을 지정합니다. 이 클래스는 로그인 제목을 감싸는 컨테이너에 사용됩니다.
                    
              .wrap {
                  /* background-color: green; */
                  width: 300px;
                  margin: 20px auto 0px auto;
              }      
          </style>
      </head>
`.wrap` : wrap 클래스에 대한 스타일을 정의하며, 폭과 여백을 지정합니다. 이 클래스는 로그인 폼을 감싸는 컨테이너에 사용됩니다.
     
      <body>
          <div class="wrap">
              <div class="mytitle">
                  <h1>Login Page</h1>
                  <h5>input id & pw</h5>
              </div>
              <p>ID : <input type="text" /></p>
              <p>pw : <input type="text" /></p>
              <button>Login</button>
          </div>
    </body>
     </html>
`body`:사용자에게 표시되는 웹 페이지 내용을 포함하는 부분입니다.</br>
`div class = wrap` : 요소 내부에는  div class = mytitle 요소가 있으며, 이 요소에는 로그인 페이지 제목 h1과  부제목 h5가 들어 있습니다. 두 요소는 mytitle클래스를 사용하여 스타일이 지정됩니다.</br>
제목아래에는 두 개의 p 요소가 있으며, 각각 아이디와 비밀번호를 표시하고 텍스트를 입력할 수 있는 input요소가 따릅니다.</br>
마지막으로 로그인 텍스트를 가진 button 요소가 있습니다.</br>

   
</div>

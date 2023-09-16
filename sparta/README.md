# Spartiflix
<div>
<img src = https://github.com/Joo-Veloper/NB/assets/134623719/5c8bb226-a3a3-4fbe-9b47-b36119195051>
</div>

# 리뷰
1. **HTML 구조와 태그 사용:** HTML 문서를 구성하는 요소들과 각 태그의 역할에 대해 이해하게 되었습니다. `<head>`와 `<body>` 같은 요소들은 문서의 구조를 정의하며, 다양한 태그들을 통해 내용과 구조를 형성할 수 있습니다.
2. **CSS 스타일링 및 클래스 사용:** CSS를 사용하여 웹 페이지의 디자인과 레이아웃을 커스터마이징하는 방법을 배웠습니다. 클래스와 ID를 사용하여 스타일을 적용하고 요소들을 꾸밀 수 있습니다.
3. **JavaScript 이벤트 처리와 DOM 조작:** JavaScript를 사용하여 이벤트를 처리하고 동적으로 웹 페이지를 조작하는 방법을 배웠습니다. `$(document).ready()`를 사용하여 페이지 로딩 후 실행할 코드를 정의하고, 함수를 통해 DOM 요소를 조작하는 방법을 익혔습니다.
4. **외부 라이브러리 활용:** 외부 라이브러리인 jQuery와 Bootstrap을 활용하여 웹 개발을 간편하게 할 수 있다는 점을 알게 되었습니다. 이러한 라이브러리는 표준적인 기능을 간소화하고 스타일링을 용이하게 해 줍니다.
5. **데이터 가져오기와 API 호출:** JavaScript를 사용하여 외부 API를 호출하고 데이터를 가져오는 방법을 배웠습니다. 이를 통해 실시간 정보를 웹 페이지에 표시하거나 활용할 수 있다는 것을 알게 되었습니다.
6. **웹사이트 디자인과 반응형 웹:** Bootstrap을 사용하여 웹사이트를 반응형으로 디자인하는 방법을 알게 되었습니다. 이로써 다양한 기기와 화면 크기에서 웹사이트가 올바르게 동작하고 보이도록 할 수 있습니다.
7. **사용자 입력 처리와 보안 고려:** 사용자의 입력을 받아오는 방법과 이를 안전하게 처리하고 유효성을 검증하는 중요성을 배웠습니다.
8. **웹 개발 전체 프로세스 이해:** HTML, CSS, JavaScript를 조합하여 웹 페이지를 구축하고 기능을 추가하는 과정을 경험하여 웹 개발의 전체 프로세스를 이해하게 되었습니다.



# code
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>스파르타플릭스</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap');

        * {
            font-family: 'Gowun Dodum', sans-serif;
        }

        .main {
            color: white;

            background-image: url('https://occ-0-1123-1217.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABeIfo7VL_VDyKnljV66IkR-4XLb6xpZqhpLSo3JUtbivnEW4s60PD27muH1mdaANM_8rGpgbm6L2oDgA_iELHZLZ2IQjG5lvp5d2.jpg?r=e6e.jpg');
            background-position: center;
            background-size: cover;
        }

        body {
            background-color: black;
        }

        .mycards {
            width: 1200px;
            margin: 20px auto 20px auto;
        }

        .mypostingbox {
            width: 500px;
            margin: 20px auto 20px auto;

            border: 1px solid white;
            padding: 20px;
            border-radius: 5px;
        }

        .form-floating>input {
            background-color: transparent;
            color: white;
        }

        .form-floating>label {
            color: white;
        }

        .input-group>label {
            background-color: transparent;
            color: white;
        }

        .mypostingbox>button {
            width: 100%;
        }
    </style>
    <script>
        $(document).ready(function () {
            let url = "http://spartacodingclub.shop/sparta_api/weather/seoul";
            fetch(url).then(res => res.json()).then(data => {
               let temp =  data['temp'];
               $('#heat').text(temp);
            })
        })

        function openclose() {
            $('#postingbox').toggle();
        }
        function makeCard() {
            let image = $('#image').val();
            let title = $('#title').val();
            let comment = $('#comment').val();
            let star = $('#star').val();
            
            let temp_html = `
            <div class="col">
                <div class="card h-100">
                    <img src="${image}"
                        class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">${title}</h5>
                        <p class="card-text">${star}</p>
                        <p class="card-text">${comment}</p>
                    </div>
                </div>
            </div>`;
            $('#card').append(temp_html);
        }
    </script>
    </head>
    
    <body>
        <header class="p-3 text-bg-dark">
            <div class="container">
                <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                    <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                        <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap">
                            <use xlink:href="#bootstrap"></use>
                        </svg>
                    </a>

                <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                    <li><a href="#" class="nav-link px-2 text-danger">spartaflix</a></li>
                    <li><a href="#" class="nav-link px-2 text-white">홈</a></li>
                    <li><a href="#" class="nav-link px-2 text-white">시리즈</a></li>
                    <li><a href="#" class="nav-link px-2 text-white">영화</a></li>
                    <li><a href="#" class="nav-link px-2 text-white">내가 찜한 콘텐츠</a></li>
                    <li><a href="#" class="nav-link px-2 text-white">현재기온 :<span id = "heat"></span>도</a></li>
                </ul>

                <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
                    <input type="search" class="form-control form-control-dark text-bg-dark" placeholder="Search..."
                        aria-label="Search">
                </form>

                <div class="text-end">
                    <button type="button" class="btn btn-outline-light me-2">Login</button>
                    <button type="button" class="btn btn-danger">Sign-up</button>
                </div>
            </div>
        </div>
    </header>
    <div class="main">
        <div class="p-5 mb-4 bg-body-tertiary rounded-3">
            <div class="container-fluid py-5">
                <h1 class="display-5 fw-bold">킹덤</h1>
                <p class="col-md-8 fs-4">병든 왕을 둘러싸고 흉흉한 소문이 떠돈다. 어둠에 뒤덮인 조선, 기이한 역병에 신음하는 산하. 정체 모를 악에 맞서 백성을 구원할 희망은 오직
                    세자뿐이다.</p>
                <button onclick="openclose()" type="button" class="btn btn-outline-light">영화 기록하기</button>
                <button type="button" class="btn btn-outline-light">상세정보</button>
            </div>
        </div>
    </div>

    <div class="mypostingbox" id="postingbox">
        <div class="form-floating mb-3">
            <input type="email" class="form-control" id="image" placeholder="영화 이미지 주소">
            <label for="floatingInput">영화 이미지 주소</label>
        </div>
        <div class="form-floating mb-3">
            <input type="email" class="form-control" id="title" placeholder="영화 제목">
            <label for="floatingInput">영화 제목</label>
        </div>
        <div class="input-group mb-3">
            <label class="input-group-text" for="inputGroupSelect01">별점</label>
            <select class="form-select" id = "star">
                <option selected>별점선택</option>
                <option value="⭐">⭐</option>
                <option value="⭐⭐">⭐⭐</option>
                <option value="⭐⭐⭐">⭐⭐⭐</option>
                <option value="⭐⭐⭐⭐">⭐⭐⭐⭐</option>
                <option value="⭐⭐⭐⭐⭐">⭐⭐⭐⭐⭐</option>
            </select>
        </div>
        <div class="form-floating mb-3">
            <input type="email" class="form-control" id="comment" placeholder="추천 이유">
            <label for="floatingInput">추천 이유</label>
        </div>
        
        <button onclick="makeCard()" type="button" class="btn btn-danger">기록하기</button>
    </div>

    <div class="mycards">
        <div id="card" class="row row-cols-1 row-cols-md-4 g-4">
            <div class="col">
                <div class="card h-100">
                    <img src="https://movie-phinf.pstatic.net/20210728_221/1627440327667GyoYj_JPEG/movie_image.jpg"
                        class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">영화 제목</h5>
                        <p class="card-text">⭐⭐⭐</p>
                        <p class="card-text">영화 코멘트</p>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card h-100">
                    <img src="https://movie-phinf.pstatic.net/20210728_221/1627440327667GyoYj_JPEG/movie_image.jpg"
                        class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">영화 제목</h5>
                        <p class="card-text">⭐⭐⭐</p>
                        <p class="card-text">영화 코멘트</p>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card h-100">
                    <img src="https://movie-phinf.pstatic.net/20210728_221/1627440327667GyoYj_JPEG/movie_image.jpg"
                        class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">영화 제목</h5>
                        <p class="card-text">⭐⭐⭐</p>
                        <p class="card-text">영화 코멘트</p>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card h-100">
                    <img src="https://movie-phinf.pstatic.net/20210728_221/1627440327667GyoYj_JPEG/movie_image.jpg"
                        class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">영화 제목</h5>
                        <p class="card-text">⭐⭐⭐</p>
                        <p class="card-text">영화 코멘트</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
    


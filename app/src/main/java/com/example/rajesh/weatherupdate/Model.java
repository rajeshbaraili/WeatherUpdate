package com.example.rajesh.weatherupdate;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rajesh on 5/18/2017.
 */

public class Model {

//hi mnoj i adding test
    /**
     * cod : 200
     * message : 0.0051
     * cnt : 36
     * list : [{"dt":1487246400,"main":{"temp":282.66,"temp_min":282.406,"temp_max":282.66,"pressure":988.54,"sea_level":1026.93,"grnd_level":988.54,"humidity":94,"temp_kf":0.25},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.41,"deg":189.001},"rain":{"3h":3.385},"sys":{"pod":"n"},"dt_txt":"2017-02-16 12:00:00"},{"dt":1487257200,"main":{"temp":284.04,"temp_min":283.846,"temp_max":284.04,"pressure":987.85,"sea_level":1026.69,"grnd_level":987.85,"humidity":99,"temp_kf":0.19},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":100},"wind":{"speed":2.57,"deg":175.001},"rain":{"3h":11.005},"sys":{"pod":"d"},"dt_txt":"2017-02-16 15:00:00"},{"dt":1487268000,"main":{"temp":285.5,"temp_min":285.373,"temp_max":285.5,"pressure":988.68,"sea_level":1027.48,"grnd_level":988.68,"humidity":100,"temp_kf":0.13},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":100},"wind":{"speed":1.21,"deg":207},"rain":{"3h":4.325},"sys":{"pod":"d"},"dt_txt":"2017-02-16 18:00:00"},{"dt":1487278800,"main":{"temp":286.29,"temp_min":286.228,"temp_max":286.29,"pressure":987.96,"sea_level":1026.59,"grnd_level":987.96,"humidity":100,"temp_kf":0.06},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.39,"deg":163.502},"rain":{"3h":1.565},"sys":{"pod":"d"},"dt_txt":"2017-02-16 21:00:00"},{"dt":1487289600,"main":{"temp":285.816,"temp_min":285.816,"temp_max":285.816,"pressure":986.62,"sea_level":1025.33,"grnd_level":986.62,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.44,"deg":160.503},"rain":{"3h":0.8},"sys":{"pod":"n"},"dt_txt":"2017-02-17 00:00:00"},{"dt":1487300400,"main":{"temp":284.593,"temp_min":284.593,"temp_max":284.593,"pressure":986.38,"sea_level":1024.93,"grnd_level":986.38,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.97,"deg":175.002},"rain":{"3h":0.795},"sys":{"pod":"n"},"dt_txt":"2017-02-17 03:00:00"},{"dt":1487311200,"main":{"temp":283.978,"temp_min":283.978,"temp_max":283.978,"pressure":984.2,"sea_level":1022.8,"grnd_level":984.2,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.96,"deg":148.505},"rain":{"3h":0.255},"sys":{"pod":"n"},"dt_txt":"2017-02-17 06:00:00"},{"dt":1487322000,"main":{"temp":283.795,"temp_min":283.795,"temp_max":283.795,"pressure":981.84,"sea_level":1020.3,"grnd_level":981.84,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.35,"deg":138.004},"rain":{"3h":0.43},"sys":{"pod":"n"},"dt_txt":"2017-02-17 09:00:00"},{"dt":1487332800,"main":{"temp":283.378,"temp_min":283.378,"temp_max":283.378,"pressure":977.52,"sea_level":1015.92,"grnd_level":977.52,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.62,"deg":132.001},"rain":{"3h":2.95},"sys":{"pod":"n"},"dt_txt":"2017-02-17 12:00:00"},{"dt":1487343600,"main":{"temp":283.005,"temp_min":283.005,"temp_max":283.005,"pressure":974.24,"sea_level":1012.53,"grnd_level":974.24,"humidity":99,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":3.16,"deg":121.001},"rain":{"3h":4.48},"sys":{"pod":"d"},"dt_txt":"2017-02-17 15:00:00"},{"dt":1487354400,"main":{"temp":285.139,"temp_min":285.139,"temp_max":285.139,"pressure":972.55,"sea_level":1010.66,"grnd_level":972.55,"humidity":99,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.82,"deg":158.001},"rain":{"3h":3.17},"sys":{"pod":"d"},"dt_txt":"2017-02-17 18:00:00"},{"dt":1487365200,"main":{"temp":285.084,"temp_min":285.084,"temp_max":285.084,"pressure":970.28,"sea_level":1008.05,"grnd_level":970.28,"humidity":100,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.41,"deg":148.003},"rain":{"3h":6.51},"sys":{"pod":"d"},"dt_txt":"2017-02-17 21:00:00"},{"dt":1487376000,"main":{"temp":284.811,"temp_min":284.811,"temp_max":284.811,"pressure":968.05,"sea_level":1006.12,"grnd_level":968.05,"humidity":100,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.11,"deg":190},"rain":{"3h":11.94},"sys":{"pod":"n"},"dt_txt":"2017-02-18 00:00:00"},{"dt":1487386800,"main":{"temp":282.765,"temp_min":282.765,"temp_max":282.765,"pressure":968.95,"sea_level":1006.96,"grnd_level":968.95,"humidity":100,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.96,"deg":197.502},"rain":{"3h":4.37},"sys":{"pod":"n"},"dt_txt":"2017-02-18 03:00:00"},{"dt":1487397600,"main":{"temp":281.862,"temp_min":281.862,"temp_max":281.862,"pressure":969.67,"sea_level":1007.85,"grnd_level":969.67,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.06,"deg":187.5},"rain":{"3h":0.97000000000001},"sys":{"pod":"n"},"dt_txt":"2017-02-18 06:00:00"},{"dt":1487408400,"main":{"temp":281.898,"temp_min":281.898,"temp_max":281.898,"pressure":970.62,"sea_level":1008.87,"grnd_level":970.62,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.15,"deg":150.008},"rain":{"3h":0.26},"sys":{"pod":"n"},"dt_txt":"2017-02-18 09:00:00"},{"dt":1487419200,"main":{"temp":281.827,"temp_min":281.827,"temp_max":281.827,"pressure":972.14,"sea_level":1010.55,"grnd_level":972.14,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.86,"deg":213.504},"rain":{"3h":1.31},"sys":{"pod":"n"},"dt_txt":"2017-02-18 12:00:00"},{"dt":1487430000,"main":{"temp":281.717,"temp_min":281.717,"temp_max":281.717,"pressure":974.22,"sea_level":1012.74,"grnd_level":974.22,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":1.67,"deg":292.502},"rain":{"3h":0.57},"sys":{"pod":"d"},"dt_txt":"2017-02-18 15:00:00"},{"dt":1487440800,"main":{"temp":282.047,"temp_min":282.047,"temp_max":282.047,"pressure":976.21,"sea_level":1014.73,"grnd_level":976.21,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":80},"wind":{"speed":2.67,"deg":305.003},"rain":{"3h":0.079999999999998},"sys":{"pod":"d"},"dt_txt":"2017-02-18 18:00:00"},{"dt":1487451600,"main":{"temp":282.739,"temp_min":282.739,"temp_max":282.739,"pressure":977.17,"sea_level":1015.63,"grnd_level":977.17,"humidity":88,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":3.52,"deg":297.002},"rain":{"3h":0.030000000000001},"sys":{"pod":"d"},"dt_txt":"2017-02-18 21:00:00"},{"dt":1487462400,"main":{"temp":282.528,"temp_min":282.528,"temp_max":282.528,"pressure":978.03,"sea_level":1016.48,"grnd_level":978.03,"humidity":85,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":32},"wind":{"speed":3.86,"deg":295.004},"rain":{},"sys":{"pod":"n"},"dt_txt":"2017-02-19 00:00:00"},{"dt":1487473200,"main":{"temp":279.848,"temp_min":279.848,"temp_max":279.848,"pressure":979.44,"sea_level":1018.24,"grnd_level":979.44,"humidity":89,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":24},"wind":{"speed":2.91,"deg":289.5},"rain":{},"sys":{"pod":"n"},"dt_txt":"2017-02-19 03:00:00"},{"dt":1487484000,"main":{"temp":279.495,"temp_min":279.495,"temp_max":279.495,"pressure":980.77,"sea_level":1019.76,"grnd_level":980.77,"humidity":91,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":68},"wind":{"speed":1.72,"deg":276.005},"rain":{"3h":0.009999999999998},"sys":{"pod":"n"},"dt_txt":"2017-02-19 06:00:00"},{"dt":1487494800,"main":{"temp":279.406,"temp_min":279.406,"temp_max":279.406,"pressure":981.4,"sea_level":1020.43,"grnd_level":981.4,"humidity":90,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.26,"deg":222.002},"rain":{"3h":0.22},"sys":{"pod":"n"},"dt_txt":"2017-02-19 09:00:00"},{"dt":1487505600,"main":{"temp":279.222,"temp_min":279.222,"temp_max":279.222,"pressure":980.31,"sea_level":1019.38,"grnd_level":980.31,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":1.62,"deg":165.503},"rain":{"3h":1.35},"sys":{"pod":"n"},"dt_txt":"2017-02-19 12:00:00"},{"dt":1487516400,"main":{"temp":279.834,"temp_min":279.834,"temp_max":279.834,"pressure":981.04,"sea_level":1019.95,"grnd_level":981.04,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.83,"deg":174.503},"rain":{"3h":2.9},"sys":{"pod":"d"},"dt_txt":"2017-02-19 15:00:00"},{"dt":1487527200,"main":{"temp":281.884,"temp_min":281.884,"temp_max":281.884,"pressure":982.84,"sea_level":1021.58,"grnd_level":982.84,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":76},"wind":{"speed":1.41,"deg":147.004},"rain":{"3h":0.91999999999999},"sys":{"pod":"d"},"dt_txt":"2017-02-19 18:00:00"},{"dt":1487538000,"main":{"temp":284.298,"temp_min":284.298,"temp_max":284.298,"pressure":983.53,"sea_level":1022.21,"grnd_level":983.53,"humidity":93,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":56},"wind":{"speed":1.32,"deg":141.502},"rain":{"3h":0.070000000000007},"sys":{"pod":"d"},"dt_txt":"2017-02-19 21:00:00"},{"dt":1487548800,"main":{"temp":284.318,"temp_min":284.318,"temp_max":284.318,"pressure":983.91,"sea_level":1022.67,"grnd_level":983.91,"humidity":91,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":44},"wind":{"speed":1.51,"deg":135.502},"rain":{"3h":0.030000000000001},"sys":{"pod":"n"},"dt_txt":"2017-02-20 00:00:00"},{"dt":1487559600,"main":{"temp":281.956,"temp_min":281.956,"temp_max":281.956,"pressure":984.63,"sea_level":1023.49,"grnd_level":984.63,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.62,"deg":109.501},"rain":{"3h":0.16},"sys":{"pod":"n"},"dt_txt":"2017-02-20 03:00:00"},{"dt":1487570400,"main":{"temp":282.005,"temp_min":282.005,"temp_max":282.005,"pressure":985.39,"sea_level":1024.2,"grnd_level":985.39,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.11,"deg":122.001},"rain":{"3h":0.87},"sys":{"pod":"n"},"dt_txt":"2017-02-20 06:00:00"},{"dt":1487581200,"main":{"temp":283.1,"temp_min":283.1,"temp_max":283.1,"pressure":986.59,"sea_level":1025.44,"grnd_level":986.59,"humidity":100,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.79,"deg":164},"rain":{"3h":5.3},"sys":{"pod":"n"},"dt_txt":"2017-02-20 09:00:00"},{"dt":1487592000,"main":{"temp":282.552,"temp_min":282.552,"temp_max":282.552,"pressure":986.61,"sea_level":1025.3,"grnd_level":986.61,"humidity":100,"temp_kf":0},"weather":[{"id":502,"main":"Rain","description":"heavy intensity rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.66,"deg":132.501},"rain":{"3h":13.93},"sys":{"pod":"n"},"dt_txt":"2017-02-20 12:00:00"},{"dt":1487602800,"main":{"temp":283.943,"temp_min":283.943,"temp_max":283.943,"pressure":984.68,"sea_level":1023.2,"grnd_level":984.68,"humidity":98,"temp_kf":0},"weather":[{"id":502,"main":"Rain","description":"heavy intensity rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.96,"deg":149.001},"rain":{"3h":17.27},"sys":{"pod":"d"},"dt_txt":"2017-02-20 15:00:00"},{"dt":1487613600,"main":{"temp":286.918,"temp_min":286.918,"temp_max":286.918,"pressure":985.61,"sea_level":1023.94,"grnd_level":985.61,"humidity":98,"temp_kf":0},"weather":[{"id":502,"main":"Rain","description":"heavy intensity rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":5.87,"deg":194.001},"rain":{"3h":12.18},"sys":{"pod":"d"},"dt_txt":"2017-02-20 18:00:00"},{"dt":1487624400,"main":{"temp":286.949,"temp_min":286.949,"temp_max":286.949,"pressure":985.81,"sea_level":1024.04,"grnd_level":985.81,"humidity":99,"temp_kf":0},"weather":[{"id":502,"main":"Rain","description":"heavy intensity rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":5.57,"deg":203.003},"rain":{"3h":13.44},"sys":{"pod":"d"},"dt_txt":"2017-02-20 21:00:00"}]
     * city : {"id":5375480,"name":"Mountain View","coord":{"lat":37.3861,"lon":-122.0839},"country":"US","population":74066}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 5375480
         * name : Mountain View
         * coord : {"lat":37.3861,"lon":-122.0839}
         * country : US
         * population : 74066
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;
        private int population;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class CoordBean {
            /**
             * lat : 37.3861
             * lon : -122.0839
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1487246400
         * main : {"temp":282.66,"temp_min":282.406,"temp_max":282.66,"pressure":988.54,"sea_level":1026.93,"grnd_level":988.54,"humidity":94,"temp_kf":0.25}
         * weather : [{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}]
         * clouds : {"all":92}
         * wind : {"speed":2.41,"deg":189.001}
         * rain : {"3h":3.385}
         * sys : {"pod":"n"}
         * dt_txt : 2017-02-16 12:00:00
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private RainBean rain;
        private SysBean sys;
        private String dt_txt;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 282.66
             * temp_min : 282.406
             * temp_max : 282.66
             * pressure : 988.54
             * sea_level : 1026.93
             * grnd_level : 988.54
             * humidity : 94
             * temp_kf : 0.25
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 92
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 2.41
             * deg : 189.001
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class RainBean {
            /**
             * 3h : 3.385
             */

            @SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class SysBean {
            /**
             * pod : n
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class WeatherBean {
            /**
             * id : 501
             * main : Rain
             * description : moderate rain
             * icon : 10n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}

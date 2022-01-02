package by.jonline.modul04.composition.exercise03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class State {

    private String capital;
    private String area;
    private ArrayList<Region> regions;
    private static final String unknow = "UNKNOW";

    public State() {
        capital = unknow;
        area = unknow;
        regions = new ArrayList<>();
    }

    public State(String capital, String area) {
        this.capital = capital;
        this.area = area;
        regions = new ArrayList<>();
    }

    public void sortForRegion() {
        Region[] regions = new Region[this.regions.size()];
        for (int i = 0; i < regions.length; i++) {
            regions[i] = this.regions.get(i);
        }
        Arrays.sort(regions);
        for (int i = 0; i < regions.length; i++) {
            this.regions.set(i, regions[i]);
        }
    }

    @Override
    public String toString() {
        return "State{" +
                "capital='" + capital + '\'' +
                ", area='" + area + '\'' +
                ", regions=" + regions +
                '}';
    }

    public void printInfo() {
        System.out.println("Capital: " + capital + ";");
        System.out.println("Area: " + area + ";");
        System.out.print("Number of regions - " + regions.size() + " Regional Centre:");
        int count = 1;
        for (Region temp : regions) {
            if (count < regions.size()) {
                System.out.print(" " + temp.getRegionalCentre() + ",");
                count++;
            } else {
                System.out.print(" " + temp.getRegionalCentre() + ";");
            }
        }
        System.out.println();
    }

    public int size() {
        return regions.size();
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public void addRegion(int index, Region element) {
        regions.add(index, element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return capital.equals(state.capital) && area.equals(state.area) && regions.equals(state.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capital);
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public class Region implements Comparable<Region> {

        private String regionalCentre;
        private ArrayList<District> districts;

        public Region() {
            regionalCentre = unknow;

        }

        public Region(String regionalCentre) {
            this.regionalCentre = regionalCentre;
            districts = new ArrayList<>();
        }

        public void printInfo() {
            System.out.println("Regional Centre: " + regionalCentre + ";");
            System.out.print("Number of districts - " + districts.size() + " District Centers:");
            int count = 1;
            for (District temp : districts) {
                if (count < districts.size()) {
                    System.out.print(" " + temp.getDistrictCenter() + ",");
                    count++;
                } else {
                    System.out.print(" " + temp.getDistrictCenter() + ";");
                }
            }
            System.out.println();
        }

        public String getRegionalCentre() {
            return regionalCentre;
        }

        public void setRegionalCentre(String regionalCentre) {
            this.regionalCentre = regionalCentre;
        }

        public ArrayList<District> getDistricts() {
            return districts;
        }

        public void setDistricts(ArrayList<District> districts) {
            this.districts = districts;
        }

        public void addDistrict(District district) {
            districts.add(district);
        }

        public void addDistrict(int index, District element) {
            districts.add(index, element);
        }

        @Override
        public String toString() {
            return "\n\t\tRegion{" +
                    "\nregionalCentre='" + regionalCentre + '\'' +
                    ", districts=" + districts +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Region region = (Region) o;
            return Objects.equals(regionalCentre, region.regionalCentre) && Objects.equals(districts, region.districts);
        }

        @Override
        public int hashCode() {
            return Objects.hash(regionalCentre);
        }

        @Override
        public int compareTo(Region o) {
            return this.regionalCentre.compareTo(o.regionalCentre);
        }

        public class District implements Comparable<District> {

            private String districtCenter;
            private ArrayList<City> cities;

            public District() {
                districtCenter = unknow;
                cities = new ArrayList<>();
            }

            public District(String districtCenter) {
                this.districtCenter = districtCenter;
                cities = new ArrayList<>();
            }

            @Override
            public int compareTo(District o) {
                return this.districtCenter.compareTo(o.districtCenter);
            }

            public void addCity(City city) {
                cities.add(city);
            }

            public void addCity(int index, City element) {
                cities.add(index, element);
            }

            @Override
            public String toString() {
                return "\n\tDistrict{" +
                        "\ndistrictCenter='" + districtCenter + '\'' +
                        ",\ncities=" + cities +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                District district = (District) o;
                return Objects.equals(districtCenter, district.districtCenter) && Objects.equals(cities, district.cities);
            }

            @Override
            public int hashCode() {
                return Objects.hash(districtCenter);
            }

            public String getDistrictCenter() {
                return districtCenter;
            }

            public void setDistrictCenter(String districtCenter) {
                this.districtCenter = districtCenter;
            }

            public ArrayList<City> getCities() {
                return cities;
            }

            public void setCities(ArrayList<City> cities) {
                this.cities = cities;
            }

            public class City {

                private String name;

                public City() {
                    name = unknow;
                }

                public City(String name) {
                    this.name = name;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (o == null || getClass() != o.getClass()) return false;
                    City city = (City) o;
                    return Objects.equals(name, city.name);
                }

                @Override
                public int hashCode() {
                    return Objects.hash(name);
                }

                @Override
                public String toString() {
                    return "City{" +
                            "name='" + name + '\'' +
                            '}';
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }
    }
}

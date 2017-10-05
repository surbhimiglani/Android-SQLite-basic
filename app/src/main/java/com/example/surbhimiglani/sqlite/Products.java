package com.example.surbhimiglani.sqlite;


public class Products {


        private int _id;
        private String _product;

        public Products(){

        }

        public Products(String _product) {
            this._product = _product;
        }

        public Products(int _id) {
            this._id = _id;
        }

        public int get_id() {
            return _id;
        }

        public String get_Product() {
            return _product;
        }

        public void set_Product(String _Product) {
            this._product = _Product;
        }

        public void set_id(int _id) {
            this._id = _id;
        }
    }


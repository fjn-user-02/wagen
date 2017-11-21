-- Sequence: public.shop_mst_id_seq

-- DROP SEQUENCE public.shop_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.shop_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.shop_mst_id_seq
  OWNER TO webapp;
 
-- Sequence: public.dealer_mst_id_seq

-- DROP SEQUENCE public.dealer_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.dealer_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.dealer_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.staff_mst_id_seq

-- DROP SEQUENCE public.staff_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.staff_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.staff_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.generation_mst_id_seq

-- DROP SEQUENCE public.generation_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.generation_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.generation_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.model_mst_id_seq

-- DROP SEQUENCE public.model_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.model_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.model_mst_id_seq
  OWNER TO webapp;
  
-- Sequence: public.item_category_mst_id_seq

-- DROP SEQUENCE public.item_category_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.item_category_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.item_category_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.item_mst_id_seq

-- DROP SEQUENCE public.item_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.item_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.item_mst_id_seq
  OWNER TO webapp;
  
-- Sequence: public.item_mst_id_seq

-- DROP SEQUENCE public.item_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.campaign_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.campaign_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.pay_mst_id_seq

-- DROP SEQUENCE public.pay_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.pay_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.pay_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.auth_mst_id_seq

-- DROP SEQUENCE public.auth_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.auth_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.auth_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.tax_mst_id_seq

-- DROP SEQUENCE public.tax_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.tax_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.tax_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.shop_auth_rel_id_seq

-- DROP SEQUENCE public.shop_auth_rel_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.shop_auth_rel_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.shop_auth_rel_id_seq
  OWNER TO webapp;

-- Sequence: public.dealer_auth_rel_id_seq

-- DROP SEQUENCE public.dealer_auth_rel_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.dealer_auth_rel_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.dealer_auth_rel_id_seq
  OWNER TO webapp;

-- Sequence: public.staff_auth_rel_id_seq

-- DROP SEQUENCE public.staff_auth_rel_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.staff_auth_rel_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.staff_auth_rel_id_seq
  OWNER TO webapp;

-- Sequence: public.public_view_mst_id_seq

-- DROP SEQUENCE public.public_view_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.public_view_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.public_view_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.public_view_detail_mst_id_seq

-- DROP SEQUENCE public.public_view_detail_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.public_view_detail_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.public_view_detail_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.home_layout_mst_id_seq

-- DROP SEQUENCE public.home_layout_mst_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.home_layout_mst_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.home_layout_mst_id_seq
  OWNER TO webapp;

-- Sequence: public.estimation_tran_id_seq

-- DROP SEQUENCE public.estimation_tran_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.estimation_tran_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.estimation_tran_id_seq
  OWNER TO webapp;

-- Sequence: public.estimation_history_tran_id_seq

-- DROP SEQUENCE public.estimation_history_tran_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.estimation_history_tran_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.estimation_history_tran_id_seq
  OWNER TO webapp;

  -- Sequence: public.create_num_tbl_id_seq

-- DROP SEQUENCE public.create_num_tbl_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.create_num_tbl_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.create_num_tbl_id_seq
  OWNER TO webapp;

-- Sequence: public.campaign_view_rel_id_seq

-- DROP SEQUENCE public.campaign_view_rel_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.campaign_view_rel_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.campaign_view_rel_id_seq
  OWNER TO webapp;


-- Table: public.shop_mst

-- DROP TABLE public.shop_mst;

CREATE TABLE IF NOT EXISTS public.shop_mst
(
  id integer NOT NULL DEFAULT nextval('shop_mst_id_seq'::regclass), -- ID
  shop_code character varying(10) NOT NULL, -- 販社コード
  shop_name character varying(50) NOT NULL, -- 販社名
  shop_kana character varying(50), -- 販社名カナ
  zip smallint, -- 郵便番号
  address1 character varying(100), -- 住所1
  address2 character varying(100), -- 住所2
  tel smallint, -- 電話番号
  fax smallint, -- FAX番号
  create_date date, -- 作成日
  update_date date, -- 更新日
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT shop_mst_pkey PRIMARY KEY (id),
  CONSTRAINT shop_mst_shop_code_key UNIQUE (shop_code)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.shop_mst
  OWNER TO webapp;
COMMENT ON TABLE public.shop_mst
  IS '販社マスタ';
COMMENT ON COLUMN public.shop_mst.id IS 'ID';
COMMENT ON COLUMN public.shop_mst.shop_code IS '販社コード';
COMMENT ON COLUMN public.shop_mst.shop_name IS '販社名';
COMMENT ON COLUMN public.shop_mst.shop_kana IS '販社名カナ';
COMMENT ON COLUMN public.shop_mst.zip IS '郵便番号';
COMMENT ON COLUMN public.shop_mst.address1 IS '住所1';
COMMENT ON COLUMN public.shop_mst.address2 IS '住所2';
COMMENT ON COLUMN public.shop_mst.tel IS '電話番号';
COMMENT ON COLUMN public.shop_mst.fax IS 'FAX番号';
COMMENT ON COLUMN public.shop_mst.create_date IS '作成日';
COMMENT ON COLUMN public.shop_mst.update_date IS '更新日';
COMMENT ON COLUMN public.shop_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.shop_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.shop_mst.update_user IS '更新者(スタッフID)';

-- Table: public.dealer_mst

-- DROP TABLE public.dealer_mst;

CREATE TABLE IF NOT EXISTS public.dealer_mst
(
  id integer NOT NULL DEFAULT nextval('dealer_mst_id_seq'::regclass), -- ID
  dealer_code character varying(10) NOT NULL, -- ディーラーコード
  dealer_name character varying(50) NOT NULL, -- ディーラー名
  dealer_kana character varying(50), -- ディーラーカナ
  zip smallint, -- 郵便番号
  address1 character varying(100), -- 住所1
  address2 character varying(100), -- 住所2
  tel smallint, -- 電話番号
  fax smallint, -- FAX番号
  mail character varying(30), -- メール送信先
  create_date date, -- 作成日
  update_date date, -- 更新日
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT dealer_mst_pkey PRIMARY KEY (id),
  CONSTRAINT dealer_mst_dealer_code_key UNIQUE (dealer_code)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.dealer_mst
  OWNER TO webapp;
COMMENT ON TABLE public.dealer_mst
  IS 'ディーラーマスタ';
COMMENT ON COLUMN public.dealer_mst.id IS 'ID';
COMMENT ON COLUMN public.dealer_mst.dealer_code IS 'ディーラーコード';
COMMENT ON COLUMN public.dealer_mst.dealer_name IS 'ディーラー名';
COMMENT ON COLUMN public.dealer_mst.dealer_kana IS 'ディーラーカナ';
COMMENT ON COLUMN public.dealer_mst.zip IS '郵便番号';
COMMENT ON COLUMN public.dealer_mst.address1 IS '住所1';
COMMENT ON COLUMN public.dealer_mst.address2 IS '住所2';
COMMENT ON COLUMN public.dealer_mst.tel IS '電話番号';
COMMENT ON COLUMN public.dealer_mst.fax IS 'FAX番号';
COMMENT ON COLUMN public.dealer_mst.mail IS 'メール送信先';
COMMENT ON COLUMN public.dealer_mst.create_date IS '作成日';
COMMENT ON COLUMN public.dealer_mst.update_date IS '更新日';
COMMENT ON COLUMN public.dealer_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.dealer_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.dealer_mst.update_user IS '更新者(スタッフID)';

-- Table: public.staff_mst

-- DROP TABLE public.staff_mst;

CREATE TABLE IF NOT EXISTS public.staff_mst
(
  id integer NOT NULL DEFAULT nextval('staff_mst_id_seq'::regclass), -- ID
  account character varying(20) NOT NULL, -- システムアカウント
  mail character varying(50) NOT NULL, -- メールアドレス
  password character varying(20) NOT NULL, -- パスワード
  shop_code character varying(10), -- 販社コード
  dealer_code character varying(10), -- ディーラーコード
  auth_code character varying(2), -- 権限コード
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT staff_mst_pkey PRIMARY KEY (id),
  CONSTRAINT r_dealer FOREIGN KEY (dealer_code)
      REFERENCES public.dealer_mst (dealer_code) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT r_shop FOREIGN KEY (shop_code)
      REFERENCES public.shop_mst (shop_code) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT staff_mst_account_key UNIQUE (account)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.staff_mst
  OWNER TO webapp;
COMMENT ON TABLE public.staff_mst
  IS 'スタッフマスタ';
COMMENT ON COLUMN public.staff_mst.id IS 'ID';
COMMENT ON COLUMN public.staff_mst.account IS 'システムアカウント';
COMMENT ON COLUMN public.staff_mst.mail IS 'メールアドレス';
COMMENT ON COLUMN public.staff_mst.password IS 'パスワード';
COMMENT ON COLUMN public.staff_mst.shop_code IS '販社コード';
COMMENT ON COLUMN public.staff_mst.dealer_code IS 'ディーラーコード';
COMMENT ON COLUMN public.staff_mst.auth_code IS '権限コード';
COMMENT ON COLUMN public.staff_mst.create_date IS '作成日';
COMMENT ON COLUMN public.staff_mst.update_date IS '更新日';
COMMENT ON COLUMN public.staff_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.staff_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.staff_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.staff_mst.update_user IS '更新者(スタッフID)';

-- Table: public.generation_mst

-- DROP TABLE public.generation_mst;

CREATE TABLE IF NOT EXISTS public.generation_mst
(
  id integer NOT NULL DEFAULT nextval('generation_mst_id_seq'::regclass), -- ID
  sale_start smallint, -- 販売開始年
  sale_end smallint, -- 販売終了年
  generation smallint, -- 世代数
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT generation_mst_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.generation_mst
  OWNER TO webapp;
COMMENT ON TABLE public.generation_mst
  IS '車種世代マスタ';
COMMENT ON COLUMN public.generation_mst.id IS 'ID';
COMMENT ON COLUMN public.generation_mst.sale_start IS '販売開始年';
COMMENT ON COLUMN public.generation_mst.sale_end IS '販売終了年';
COMMENT ON COLUMN public.generation_mst.generation IS '世代数';
COMMENT ON COLUMN public.generation_mst.create_date IS '作成日';
COMMENT ON COLUMN public.generation_mst.update_date IS '更新日';
COMMENT ON COLUMN public.generation_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.generation_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.generation_mst.update_user IS '更新者(スタッフID)';
COMMENT ON COLUMN public.generation_mst.create_user IS '作成者(スタッフID)';

-- Table: public.model_mst

-- DROP TABLE public.model_mst;

CREATE TABLE IF NOT EXISTS public.model_mst
(
  id integer NOT NULL DEFAULT nextval('model_mst_id_seq'::regclass), -- ID
  model_name_b character varying(150), -- 車種名（太字）
  model_name character varying(150), -- 車種名（細字）
  model_code character varying(10), -- モデルコード
  language_flg smallint, -- 言語フラグ
  free_flg smallint, -- 汎用品フラグ
  model_type character varying(20), -- 型式
  img_path character varying(50), -- 車種画像
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT model_mst_pkey PRIMARY KEY (id),
  CONSTRAINT model_mst_model_type_model_code_key UNIQUE (model_type, model_code)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.model_mst
  OWNER TO webapp;
COMMENT ON TABLE public.model_mst
  IS '車種マスタ';
COMMENT ON COLUMN public.model_mst.id IS 'ID';
COMMENT ON COLUMN public.model_mst.model_name_b IS '車種名（太字）';
COMMENT ON COLUMN public.model_mst.model_name IS '車種名（細字）';
COMMENT ON COLUMN public.model_mst.model_code IS 'モデルコード';
COMMENT ON COLUMN public.model_mst.language_flg IS '言語フラグ';
COMMENT ON COLUMN public.model_mst.free_flg IS '汎用品フラグ';
COMMENT ON COLUMN public.model_mst.model_type IS '型式';
COMMENT ON COLUMN public.model_mst.img_path IS '車種画像';
COMMENT ON COLUMN public.model_mst.create_date IS '作成日';
COMMENT ON COLUMN public.model_mst.update_date IS '更新日';
COMMENT ON COLUMN public.model_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.model_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.model_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.model_mst.update_user IS '更新者(スタッフID)';

-- Table: public.item_category_mst

-- DROP TABLE public.item_category_mst;

CREATE TABLE IF NOT EXISTS public.item_category_mst
(
  id integer NOT NULL DEFAULT nextval('item_category_mst_id_seq'::regclass), -- ID
  category_name character varying(50), -- カテゴリ名
  category_code character varying(10), -- カテゴリコード
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT item_category_mst_pkey PRIMARY KEY (id),
  CONSTRAINT item_category_mst_category_name_category_code_key UNIQUE (category_code)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.item_category_mst
  OWNER TO webapp;
COMMENT ON TABLE public.item_category_mst
  IS 'アイテムカテゴリマスタ';
COMMENT ON COLUMN public.item_category_mst.id IS 'ID';
COMMENT ON COLUMN public.item_category_mst.category_name IS 'カテゴリ名';
COMMENT ON COLUMN public.item_category_mst.category_code IS 'カテゴリコード';
COMMENT ON COLUMN public.item_category_mst.create_date IS '作成日';
COMMENT ON COLUMN public.item_category_mst.update_date IS '更新日';
COMMENT ON COLUMN public.item_category_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.item_category_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.item_category_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.item_category_mst.update_user IS '更新者(スタッフID)';

-- Table: public.item_mst

-- DROP TABLE public.item_mst;

CREATE TABLE IF NOT EXISTS public.item_mst
(
  id integer NOT NULL DEFAULT nextval('item_mst_id_seq'::regclass), -- ID
  item_name character varying(50) NOT NULL, -- 商品名
  item_code character varying(15) NOT NULL, -- 商品コード
  parts_no1 character varying(4), -- パーツナンバー1
  parts_no2 character varying(4), -- パーツナンバー2
  parts_no3 character varying(4), -- パーツナンバー3
  parts_no4 character varying(4), -- パーツナンバー4
  price_in_tax numeric(8,2), -- 税込価格
  price numeric(8,2), -- 税抜価格
  cost numeric(2,2), -- 作業時間
  description character varying(100), -- 商品説明
  spec character varying(100), -- 仕様
  excluded_item character varying(100), -- 除外商品
  caution character varying(100), -- 注意点
  must_item character varying(100), -- 必須商品
  status character varying(1), -- ステータス
  sale_info character varying(50), -- セール情報
  img_path character varying(50), -- 商品画像
  view_priority smallint, -- 表示順
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  paint_flg boolean, -- 塗装フラグ
  CONSTRAINT item_mst_pkey PRIMARY KEY (id),
  CONSTRAINT item_mst_item_name_key UNIQUE (item_name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.item_mst
  OWNER TO webapp;
COMMENT ON TABLE public.item_mst
  IS 'アイテムマスタ';
COMMENT ON COLUMN public.item_mst.id IS 'ID';
COMMENT ON COLUMN public.item_mst.item_name IS '商品名';
COMMENT ON COLUMN public.item_mst.item_code IS '商品コード';
COMMENT ON COLUMN public.item_mst.parts_no1 IS 'パーツナンバー1';
COMMENT ON COLUMN public.item_mst.parts_no2 IS 'パーツナンバー2';
COMMENT ON COLUMN public.item_mst.parts_no3 IS 'パーツナンバー3';
COMMENT ON COLUMN public.item_mst.parts_no4 IS 'パーツナンバー4';
COMMENT ON COLUMN public.item_mst.price_in_tax IS '税込価格';
COMMENT ON COLUMN public.item_mst.price IS '税抜価格';
COMMENT ON COLUMN public.item_mst.cost IS '作業時間';
COMMENT ON COLUMN public.item_mst.description IS '商品説明';
COMMENT ON COLUMN public.item_mst.spec IS '仕様';
COMMENT ON COLUMN public.item_mst.excluded_item IS '除外商品';
COMMENT ON COLUMN public.item_mst.caution IS '注意点';
COMMENT ON COLUMN public.item_mst.must_item IS '必須商品';
COMMENT ON COLUMN public.item_mst.status IS 'ステータス';
COMMENT ON COLUMN public.item_mst.sale_info IS 'セール情報';
COMMENT ON COLUMN public.item_mst.img_path IS '商品画像';
COMMENT ON COLUMN public.item_mst.view_priority IS '表示順';
COMMENT ON COLUMN public.item_mst.create_date IS '作成日';
COMMENT ON COLUMN public.item_mst.update_date IS '更新日';
COMMENT ON COLUMN public.item_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.item_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.item_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.item_mst.update_user IS '更新者(スタッフID)';
COMMENT ON COLUMN public.item_mst.paint_flg IS '塗装フラグ';

-- Table: public.campaign_mst

-- DROP TABLE public.campaign_mst;

CREATE TABLE IF NOT EXISTS public.campaign_mst
(
  id integer NOT NULL DEFAULT nextval('campaign_mst_id_seq'::regclass), -- ID
  item_name character varying(50) NOT NULL, -- 商品名
  item_code character varying(15) NOT NULL, -- 商品コード
  parts_no1 character varying(4), -- パーツナンバー1
  parts_no2 character varying(4), -- パーツナンバー2
  parts_no3 character varying(4), -- パーツナンバー3
  parts_no4 character varying(4), -- パーツナンバー4
  price_in_tax numeric(8,2), -- 税込価格
  price numeric(8,2), -- 税抜価格
  sale_tag smallint, -- セールタグカラー
  sale_title character varying(100), -- セールタイトル
  cost numeric(2,2), -- 作業時間
  description character varying(100), -- 商品説明
  spec character varying(100), -- 仕様
  excluded_item character varying(100), -- 除外商品
  caution character varying(100), -- 注意点
  must_item character varying(100), -- 必須商品
  status character varying(1), -- ステータス
  sale_info character varying(50), -- セール情報
  img_path character varying(50), -- 商品画像
  view_priority smallint, -- 表示順
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  paint_flg boolean, -- 塗装フラグ
  CONSTRAINT campaign_mst_pkey PRIMARY KEY (id),
  CONSTRAINT campaign_mst_item_name_key UNIQUE (item_name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.campaign_mst
  OWNER TO webapp;
COMMENT ON TABLE public.campaign_mst
  IS 'キャンペーンマスタ';
COMMENT ON COLUMN public.campaign_mst.id IS 'ID';
COMMENT ON COLUMN public.campaign_mst.item_name IS '商品名';
COMMENT ON COLUMN public.campaign_mst.item_code IS '商品コード';
COMMENT ON COLUMN public.campaign_mst.parts_no1 IS 'パーツナンバー1';
COMMENT ON COLUMN public.campaign_mst.parts_no2 IS 'パーツナンバー2';
COMMENT ON COLUMN public.campaign_mst.parts_no3 IS 'パーツナンバー3';
COMMENT ON COLUMN public.campaign_mst.parts_no4 IS 'パーツナンバー4';
COMMENT ON COLUMN public.campaign_mst.price_in_tax IS '税込価格';
COMMENT ON COLUMN public.campaign_mst.price IS '税抜価格';
COMMENT ON COLUMN public.campaign_mst.sale_tag IS 'セールタグカラー';
COMMENT ON COLUMN public.campaign_mst.sale_title IS 'セールタイトル';
COMMENT ON COLUMN public.campaign_mst.cost IS '作業時間';
COMMENT ON COLUMN public.campaign_mst.description IS '商品説明';
COMMENT ON COLUMN public.campaign_mst.spec IS '仕様';
COMMENT ON COLUMN public.campaign_mst.excluded_item IS '除外商品';
COMMENT ON COLUMN public.campaign_mst.caution IS '注意点';
COMMENT ON COLUMN public.campaign_mst.must_item IS '必須商品';
COMMENT ON COLUMN public.campaign_mst.status IS 'ステータス';
COMMENT ON COLUMN public.campaign_mst.sale_info IS 'セール情報';
COMMENT ON COLUMN public.campaign_mst.img_path IS '商品画像';
COMMENT ON COLUMN public.campaign_mst.view_priority IS '表示順';
COMMENT ON COLUMN public.campaign_mst.create_date IS '作成日';
COMMENT ON COLUMN public.campaign_mst.update_date IS '更新日';
COMMENT ON COLUMN public.campaign_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.campaign_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.campaign_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.campaign_mst.update_user IS '更新者(スタッフID)';
COMMENT ON COLUMN public.campaign_mst.paint_flg IS '塗装フラグ';

-- Table: public.pay_mst

-- DROP TABLE public.pay_mst;

CREATE TABLE IF NOT EXISTS public.pay_mst
(
  id integer NOT NULL DEFAULT nextval('pay_mst_id_seq'::regclass), -- ID
  shop_id smallint, -- 販社ID
  dealer_id smallint, -- ディーラーID
  model_id smallint, -- 商品ID
  price numeric(8,2), -- 工賃単価
  view_priority smallint, -- 表示順
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT pay_mst_pkey PRIMARY KEY (id),
  CONSTRAINT dealer_rel FOREIGN KEY (dealer_id)
      REFERENCES public.dealer_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT model_rel FOREIGN KEY (model_id)
      REFERENCES public.model_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT shop_rel FOREIGN KEY (shop_id)
      REFERENCES public.shop_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT pay_mst_shop_id_dealer_id_model_id_key UNIQUE (shop_id, dealer_id, model_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.pay_mst
  OWNER TO webapp;
COMMENT ON TABLE public.pay_mst
  IS '工賃マスタ';
COMMENT ON COLUMN public.pay_mst.id IS 'ID';
COMMENT ON COLUMN public.pay_mst.shop_id IS '販社ID';
COMMENT ON COLUMN public.pay_mst.dealer_id IS 'ディーラーID';
COMMENT ON COLUMN public.pay_mst.model_id IS '商品ID';
COMMENT ON COLUMN public.pay_mst.price IS '工賃単価';
COMMENT ON COLUMN public.pay_mst.view_priority IS '表示順';
COMMENT ON COLUMN public.pay_mst.create_date IS '作成日';
COMMENT ON COLUMN public.pay_mst.update_date IS '更新日';
COMMENT ON COLUMN public.pay_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.pay_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.pay_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.pay_mst.update_user IS '更新者(スタッフID)';

-- Table: public.auth_mst

-- DROP TABLE public.auth_mst;

CREATE TABLE IF NOT EXISTS public.auth_mst
(
  id integer NOT NULL DEFAULT nextval('auth_mst_id_seq'::regclass), -- ID
  auth_name character varying(50), -- 権限名称
  auth_code character varying(2), -- 権限コード
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT auth_mst_pkey PRIMARY KEY (id),
  CONSTRAINT auth_mst_auth_code_key UNIQUE (auth_code)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.auth_mst
  OWNER TO webapp;
COMMENT ON TABLE public.auth_mst
  IS '権限マスタ';
COMMENT ON COLUMN public.auth_mst.id IS 'ID';
COMMENT ON COLUMN public.auth_mst.auth_name IS '権限名称';
COMMENT ON COLUMN public.auth_mst.auth_code IS '権限コード';
COMMENT ON COLUMN public.auth_mst.create_date IS '作成日';
COMMENT ON COLUMN public.auth_mst.update_date IS '更新日';
COMMENT ON COLUMN public.auth_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.auth_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.auth_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.auth_mst.update_user IS '更新者(スタッフID)';

-- Table: public.tax_mst

-- DROP TABLE public.tax_mst;

CREATE TABLE IF NOT EXISTS public.tax_mst
(
  id integer NOT NULL DEFAULT nextval('auth_mst_id_seq'::regclass), -- ID
  tax_name character(50), -- 名称
  tax numeric(2,2), -- 税率
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT tax_mst_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.tax_mst
  OWNER TO webapp;
COMMENT ON TABLE public.tax_mst
  IS '税マスタ';
COMMENT ON COLUMN public.tax_mst.id IS 'ID';
COMMENT ON COLUMN public.tax_mst.tax_name IS '名称';
COMMENT ON COLUMN public.tax_mst.tax IS '税率';
COMMENT ON COLUMN public.tax_mst.create_date IS '作成日';
COMMENT ON COLUMN public.tax_mst.update_date IS '更新日';
COMMENT ON COLUMN public.tax_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.tax_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.tax_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.tax_mst.update_user IS '更新者(スタッフID)';

-- Table: public.shop_auth_rel

-- DROP TABLE public.shop_auth_rel;

CREATE TABLE IF NOT EXISTS public.shop_auth_rel
(
  id integer NOT NULL DEFAULT nextval('shop_auth_rel_id_seq'::regclass), -- ID
  shop_id smallint NOT NULL, -- 販社ID
  dealer_id smallint, -- ディーラーID
  auth_code character varying(10) NOT NULL, -- 権限コード
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT shop_auth_rel_pkey PRIMARY KEY (id),
  CONSTRAINT shop_auth_rel_dealer_id_fkey FOREIGN KEY (dealer_id)
      REFERENCES public.dealer_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT shop_rel FOREIGN KEY (shop_id)
      REFERENCES public.shop_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT shop_auth_rel_shop_id_dealer_id_auth_code_key UNIQUE (shop_id, dealer_id, auth_code)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.shop_auth_rel
  OWNER TO webapp;
COMMENT ON TABLE public.shop_auth_rel
  IS '販社権限テーブル';
COMMENT ON COLUMN public.shop_auth_rel.id IS 'ID';
COMMENT ON COLUMN public.shop_auth_rel.shop_id IS '販社ID';
COMMENT ON COLUMN public.shop_auth_rel.dealer_id IS 'ディーラーID';
COMMENT ON COLUMN public.shop_auth_rel.auth_code IS '権限コード';
COMMENT ON COLUMN public.shop_auth_rel.create_date IS '作成日';
COMMENT ON COLUMN public.shop_auth_rel.update_date IS '更新日';
COMMENT ON COLUMN public.shop_auth_rel.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.shop_auth_rel.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.shop_auth_rel.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.shop_auth_rel.update_user IS '更新者(スタッフID)';

-- Table: public.dealer_auth_rel

-- DROP TABLE public.dealer_auth_rel;

CREATE TABLE IF NOT EXISTS public.dealer_auth_rel
(
  id integer NOT NULL DEFAULT nextval('dealer_auth_rel_id_seq'::regclass), -- ID
  dealer_id integer NOT NULL, -- ディーラーID
  staff_id smallint, -- スタッフID
  auth_code character varying(10) NOT NULL, -- 権限コード
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT dealer_auth_rel_pkey PRIMARY KEY (id),
  CONSTRAINT dealer_auth_rel_staff_id_fkey FOREIGN KEY (staff_id)
      REFERENCES public.staff_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT dealer_rel FOREIGN KEY (dealer_id)
      REFERENCES public.dealer_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT dealer_auth_rel_dealer_id_staff_id_auth_code_key UNIQUE (dealer_id, staff_id, auth_code)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.dealer_auth_rel
  OWNER TO webapp;
COMMENT ON TABLE public.dealer_auth_rel
  IS 'ディーラー権限テーブル';
COMMENT ON COLUMN public.dealer_auth_rel.id IS 'ID';
COMMENT ON COLUMN public.dealer_auth_rel.dealer_id IS 'ディーラーID';
COMMENT ON COLUMN public.dealer_auth_rel.staff_id IS 'スタッフID';
COMMENT ON COLUMN public.dealer_auth_rel.auth_code IS '権限コード';
COMMENT ON COLUMN public.dealer_auth_rel.create_date IS '作成日';
COMMENT ON COLUMN public.dealer_auth_rel.update_date IS '更新日';
COMMENT ON COLUMN public.dealer_auth_rel.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.dealer_auth_rel.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.dealer_auth_rel.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.dealer_auth_rel.update_user IS '更新者(スタッフID)';

-- Table: public.staff_auth_rel

-- DROP TABLE public.staff_auth_rel;

CREATE TABLE IF NOT EXISTS public.staff_auth_rel
(
  id integer NOT NULL DEFAULT nextval('staff_auth_rel_id_seq'::regclass), -- ID
  staff_id integer NOT NULL, -- スタッフID
  auth_code character varying(10) NOT NULL, -- 権限コード
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT staff_auth_rel_pkey PRIMARY KEY (id),
  CONSTRAINT staff_rel FOREIGN KEY (staff_id)
      REFERENCES public.staff_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT staff_auth_rel_staff_id_auth_code_key UNIQUE (staff_id, auth_code)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.staff_auth_rel
  OWNER TO webapp;
COMMENT ON TABLE public.staff_auth_rel
  IS 'スタッフ権限テーブル';
COMMENT ON COLUMN public.staff_auth_rel.id IS 'ID';
COMMENT ON COLUMN public.staff_auth_rel.staff_id IS 'スタッフID';
COMMENT ON COLUMN public.staff_auth_rel.auth_code IS '権限コード';
COMMENT ON COLUMN public.staff_auth_rel.create_date IS '作成日';
COMMENT ON COLUMN public.staff_auth_rel.update_date IS '更新日';
COMMENT ON COLUMN public.staff_auth_rel.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.staff_auth_rel.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.staff_auth_rel.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.staff_auth_rel.update_user IS '更新者(スタッフID)';

-- Table: public.model_generation_rel

-- DROP TABLE public.model_generation_rel;

CREATE TABLE IF NOT EXISTS public.model_generation_rel
(
  id integer NOT NULL, -- ID
  model_id integer NOT NULL, -- 車種ID
  generation_id integer NOT NULL, -- 世代ID
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT model_generation_rel_pkey PRIMARY KEY (id),
  CONSTRAINT generation_rel FOREIGN KEY (generation_id)
      REFERENCES public.generation_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT model_rel FOREIGN KEY (model_id)
      REFERENCES public.model_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT model_generation_rel_model_id_generation_id_key UNIQUE (model_id, generation_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.model_generation_rel
  OWNER TO webapp;
COMMENT ON TABLE public.model_generation_rel
  IS '車種・アイテム関連テーブル';
COMMENT ON COLUMN public.model_generation_rel.id IS 'ID';
COMMENT ON COLUMN public.model_generation_rel.model_id IS '車種ID';
COMMENT ON COLUMN public.model_generation_rel.generation_id IS '世代ID';
COMMENT ON COLUMN public.model_generation_rel.create_date IS '作成日';
COMMENT ON COLUMN public.model_generation_rel.update_date IS '更新日';
COMMENT ON COLUMN public.model_generation_rel.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.model_generation_rel.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.model_generation_rel.update_user IS '更新者(スタッフID)';

-- Table: public.model_item_rel

-- DROP TABLE public.model_item_rel;

CREATE TABLE IF NOT EXISTS public.model_item_rel
(
  id integer NOT NULL, -- ID
  model_id integer NOT NULL, -- 車種ID
  item_id integer NOT NULL, -- 商品ID
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT model_item_rel_pkey PRIMARY KEY (id),
  CONSTRAINT item_rel FOREIGN KEY (item_id)
      REFERENCES public.item_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT model_rel FOREIGN KEY (model_id)
      REFERENCES public.model_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT model_item_rel_model_id_item_id_key UNIQUE (model_id, item_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.model_item_rel
  OWNER TO webapp;
COMMENT ON TABLE public.model_item_rel
  IS '車種・アイテム関連テーブル';
COMMENT ON COLUMN public.model_item_rel.id IS 'ID';
COMMENT ON COLUMN public.model_item_rel.model_id IS '車種ID';
COMMENT ON COLUMN public.model_item_rel.item_id IS '商品ID';
COMMENT ON COLUMN public.model_item_rel.create_date IS '作成日';
COMMENT ON COLUMN public.model_item_rel.update_date IS '更新日';
COMMENT ON COLUMN public.model_item_rel.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.model_item_rel.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.model_item_rel.update_user IS '更新者(スタッフID)';

-- Table: public.model_campaign_rel

-- DROP TABLE public.model_campaign_rel;

CREATE TABLE IF NOT EXISTS public.model_campaign_rel
(
  id integer NOT NULL, -- ID
  model_id integer NOT NULL, -- 車種ID
  campaign_id integer NOT NULL, -- キャンペーンID
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT model_campaign_rel_pkey PRIMARY KEY (id),
  CONSTRAINT campaign_rel FOREIGN KEY (campaign_id)
      REFERENCES public.campaign_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT model_rel FOREIGN KEY (model_id)
      REFERENCES public.model_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT model_campaign_rel_model_id_campaign_id_key UNIQUE (model_id, campaign_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.model_campaign_rel
  OWNER TO webapp;
COMMENT ON TABLE public.model_campaign_rel
  IS '車種・キャンペーン関連テーブル';
COMMENT ON COLUMN public.model_campaign_rel.id IS 'ID';
COMMENT ON COLUMN public.model_campaign_rel.model_id IS '車種ID';
COMMENT ON COLUMN public.model_campaign_rel.campaign_id IS 'キャンペーンID';
COMMENT ON COLUMN public.model_campaign_rel.create_date IS '作成日';
COMMENT ON COLUMN public.model_campaign_rel.update_date IS '更新日';
COMMENT ON COLUMN public.model_campaign_rel.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.model_campaign_rel.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.model_campaign_rel.update_user IS '更新者(スタッフID)';

-- Table: public.item_category_rel

-- DROP TABLE public.item_category_rel;

CREATE TABLE IF NOT EXISTS public.item_category_rel
(
  id integer NOT NULL, -- ID
  item_id integer NOT NULL, -- 商品ID
  category_id integer NOT NULL, -- カテゴリID
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT item_category_rel_pkey PRIMARY KEY (id),
  CONSTRAINT category_rel FOREIGN KEY (category_id)
      REFERENCES public.item_category_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT item_rel FOREIGN KEY (item_id)
      REFERENCES public.item_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT item_category_rel_item_id_category_id_key UNIQUE (item_id, category_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.item_category_rel
  OWNER TO webapp;
COMMENT ON TABLE public.item_category_rel
  IS 'アイテム・カテゴリ関連テーブル';
COMMENT ON COLUMN public.item_category_rel.id IS 'ID';
COMMENT ON COLUMN public.item_category_rel.item_id IS '商品ID';
COMMENT ON COLUMN public.item_category_rel.category_id IS 'カテゴリID';
COMMENT ON COLUMN public.item_category_rel.create_date IS '作成日';
COMMENT ON COLUMN public.item_category_rel.update_date IS '更新日';
COMMENT ON COLUMN public.item_category_rel.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.item_category_rel.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.item_category_rel.update_user IS '更新者(スタッフID)';

-- Table: public.public_view_mst

-- DROP TABLE public.public_view_mst;

CREATE TABLE IF NOT EXISTS public.public_view_mst
(
  id integer NOT NULL DEFAULT nextval('public_view_mst_id_seq'::regclass), -- ID
  public_pattern character varying(2), -- 表示階層
  area_name character varying(100), -- 名称
  img_path character varying(100), -- バナー画像
  site_path character varying(100), -- 外部サイトURL
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT public_view_mst_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.public_view_mst
  OWNER TO webapp;
COMMENT ON TABLE public.public_view_mst
  IS '公開設定マスタ';
COMMENT ON COLUMN public.public_view_mst.id IS 'ID';
COMMENT ON COLUMN public.public_view_mst.public_pattern IS '表示階層';
COMMENT ON COLUMN public.public_view_mst.area_name IS '名称';
COMMENT ON COLUMN public.public_view_mst.img_path IS 'バナー画像';
COMMENT ON COLUMN public.public_view_mst.site_path IS '外部サイトURL';
COMMENT ON COLUMN public.public_view_mst.create_date IS '作成日';
COMMENT ON COLUMN public.public_view_mst.update_date IS '更新日';
COMMENT ON COLUMN public.public_view_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.public_view_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.public_view_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.public_view_mst.update_user IS '更新者(スタッフID)';

-- Table: public.public_view_detail_mst

-- DROP TABLE public.public_view_detail_mst;

CREATE TABLE IF NOT EXISTS public.public_view_detail_mst
(
  id integer NOT NULL DEFAULT nextval('public_view_detail_mst_id_seq'::regclass), -- ID
  public_view_id integer, -- 公開先エリア
  public_name character varying(100), -- 名称
  public_type character varying(2), -- 媒体種別
  img_path character varying(100), -- バナー画像
  pdf_path character varying(100), -- PDF格納先パス
  movie_path character varying(100), -- ムービーURL
  priority smallint, -- 表示順
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT public_view_detail_mst_pkey PRIMARY KEY (id),
  CONSTRAINT public_view_rel FOREIGN KEY (public_view_id)
      REFERENCES public.public_view_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.public_view_detail_mst
  OWNER TO webapp;
COMMENT ON TABLE public.public_view_detail_mst
  IS '公開設定詳細マスタ';
COMMENT ON COLUMN public.public_view_detail_mst.id IS 'ID';
COMMENT ON COLUMN public.public_view_detail_mst.public_view_id IS '公開先エリア';
COMMENT ON COLUMN public.public_view_detail_mst.public_name IS '名称';
COMMENT ON COLUMN public.public_view_detail_mst.public_type IS '媒体種別';
COMMENT ON COLUMN public.public_view_detail_mst.img_path IS 'バナー画像';
COMMENT ON COLUMN public.public_view_detail_mst.pdf_path IS 'PDF格納先パス';
COMMENT ON COLUMN public.public_view_detail_mst.movie_path IS ' ムービーURL';
COMMENT ON COLUMN public.public_view_detail_mst.priority IS ' 表示順';
COMMENT ON COLUMN public.public_view_detail_mst.create_date IS '作成日';
COMMENT ON COLUMN public.public_view_detail_mst.update_date IS '更新日';
COMMENT ON COLUMN public.public_view_detail_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.public_view_detail_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.public_view_detail_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.public_view_detail_mst.update_user IS '更新者(スタッフID)';

-- Table: public.home_layout_mst

-- DROP TABLE public.home_layout_mst;

CREATE TABLE IF NOT EXISTS public.home_layout_mst
(
  id integer NOT NULL DEFAULT nextval('home_layout_mst_id_seq'::regclass), -- ID
  public_view_id integer, -- 公開設定ID
  public_view_type character varying(2), -- 公開設定種別
  priority smallint, -- 表示優先順
  shop_id smallint, -- 公開先販社ID
  dealer_id smallint, -- 公開先ディーラーID
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT home_layout_mst_pkey PRIMARY KEY (id),
  CONSTRAINT public_view_rel FOREIGN KEY (public_view_id)
      REFERENCES public.public_view_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.home_layout_mst
  OWNER TO webapp;
COMMENT ON TABLE public.home_layout_mst
  IS 'ホームレイアウトマスタ';
COMMENT ON COLUMN public.home_layout_mst.id IS 'ID';
COMMENT ON COLUMN public.home_layout_mst.public_view_id IS '公開設定ID';
COMMENT ON COLUMN public.home_layout_mst.public_view_type IS '公開設定種別';
COMMENT ON COLUMN public.home_layout_mst.priority IS '表示優先順';
COMMENT ON COLUMN public.home_layout_mst.shop_id IS '公開先販社ID';
COMMENT ON COLUMN public.home_layout_mst.dealer_id IS '公開先ディーラーID';
COMMENT ON COLUMN public.home_layout_mst.create_date IS '作成日';
COMMENT ON COLUMN public.home_layout_mst.update_date IS '更新日';
COMMENT ON COLUMN public.home_layout_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.home_layout_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.home_layout_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.home_layout_mst.update_user IS '更新者(スタッフID)';

-- Table: public.estimation_tran

-- DROP TABLE public.estimation_tran;

CREATE TABLE IF NOT EXISTS public.estimation_tran
(
  id integer NOT NULL DEFAULT nextval('estimation_tran_id_seq'::regclass), -- ID
  estimated_number character varying(30), -- 見積番号
  shop_id smallint, -- 販社ID
  dealer_id smallint, -- ディーラーID
  create_account character varying(20), -- 初回受付担当者アカウント
  model_id smallint, -- モデルID
  item_id smallint, -- 商品ID
  campaign_id smallint, -- キャンペーン商品ID
  item_name character varying(50), -- 商品名
  item_code character varying(15), -- 商品コード
  parts_no1 character varying(4), -- パーツナンバー1
  parts_no2 character varying(4), -- パーツナンバー2
  parts_no3 character varying(4), -- パーツナンバー3
  parts_no4 character varying(4), -- パーツナンバー4
  price_in_tax numeric(8,2), -- 税込価格
  price numeric(8,2), -- 税抜価格
  sale_tag smallint, -- セールタグカラー
  sale_title character varying(100), -- セールタイトル
  img_path character varying(50), -- 商品画像
  tax_id smallint, -- 消費税
  quantity smallint, -- 数量
  install_time numeric(2,2), -- 取付時間（数量×時間）
  item_discount numeric(8,2), -- 商品値引き
  item_paint_price numeric(8,2), -- 商品塗装費
  paint_price numeric(8,2), -- 塗装費
  total_discount numeric(8,2), -- 全体値引き
  memo character varying(100), -- 特記事項
  update_account character varying(20), -- 更新担当者アカウント
  create_date date, -- 作成日
  update_date date, -- 更新日
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT estimation_tran_pkey PRIMARY KEY (id),
  CONSTRAINT dealer_rel FOREIGN KEY (dealer_id)
      REFERENCES public.dealer_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT estimation_tran_campaign_id_fkey FOREIGN KEY (campaign_id)
      REFERENCES public.campaign_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT estimation_tran_model_id_fkey FOREIGN KEY (model_id)
      REFERENCES public.model_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT item_rel FOREIGN KEY (item_id)
      REFERENCES public.item_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT shop_rel FOREIGN KEY (shop_id)
      REFERENCES public.shop_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT tax_rel FOREIGN KEY (tax_id)
      REFERENCES public.tax_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT estimation_tran_estimated_number_shop_id_dealer_id_item_id_key UNIQUE (estimated_number, shop_id, dealer_id, item_id, campaign_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.estimation_tran
  OWNER TO webapp;
COMMENT ON TABLE public.estimation_tran
  IS '見積もりテーブル';
COMMENT ON COLUMN public.estimation_tran.id IS 'ID';
COMMENT ON COLUMN public.estimation_tran.estimated_number IS '見積番号';
COMMENT ON COLUMN public.estimation_tran.shop_id IS '販社ID';
COMMENT ON COLUMN public.estimation_tran.dealer_id IS 'ディーラーID';
COMMENT ON COLUMN public.estimation_tran.create_account IS '初回受付担当者アカウント';
COMMENT ON COLUMN public.estimation_tran.model_id IS 'モデルID';
COMMENT ON COLUMN public.estimation_tran.item_id IS '商品ID';
COMMENT ON COLUMN public.estimation_tran.campaign_id IS 'キャンペーン商品ID';
COMMENT ON COLUMN public.estimation_tran.item_name IS '商品名';
COMMENT ON COLUMN public.estimation_tran.item_code IS '商品コード';
COMMENT ON COLUMN public.estimation_tran.parts_no1 IS 'パーツナンバー1';
COMMENT ON COLUMN public.estimation_tran.parts_no2 IS 'パーツナンバー2';
COMMENT ON COLUMN public.estimation_tran.parts_no3 IS 'パーツナンバー3';
COMMENT ON COLUMN public.estimation_tran.parts_no4 IS 'パーツナンバー4';
COMMENT ON COLUMN public.estimation_tran.price_in_tax IS '税込価格';
COMMENT ON COLUMN public.estimation_tran.price IS '税抜価格';
COMMENT ON COLUMN public.estimation_tran.sale_tag IS 'セールタグカラー';
COMMENT ON COLUMN public.estimation_tran.sale_title IS 'セールタイトル';
COMMENT ON COLUMN public.estimation_tran.img_path IS '商品画像';
COMMENT ON COLUMN public.estimation_tran.tax_id IS '消費税';
COMMENT ON COLUMN public.estimation_tran.quantity IS '数量';
COMMENT ON COLUMN public.estimation_tran.install_time IS '取付時間（数量×時間）';
COMMENT ON COLUMN public.estimation_tran.item_discount IS '商品値引き';
COMMENT ON COLUMN public.estimation_tran.item_paint_price IS '商品塗装費';
COMMENT ON COLUMN public.estimation_tran.paint_price IS '塗装費';
COMMENT ON COLUMN public.estimation_tran.total_discount IS '全体値引き';
COMMENT ON COLUMN public.estimation_tran.memo IS '特記事項';
COMMENT ON COLUMN public.estimation_tran.update_account IS '更新担当者アカウント';
COMMENT ON COLUMN public.estimation_tran.create_date IS '作成日';
COMMENT ON COLUMN public.estimation_tran.update_date IS '更新日';
COMMENT ON COLUMN public.estimation_tran.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.estimation_tran.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.estimation_tran.update_user IS '更新者(スタッフID)';

-- Table: public.estimation_history_tran

-- DROP TABLE public.estimation_history_tran;

CREATE TABLE IF NOT EXISTS public.estimation_history_tran
(
  id integer NOT NULL DEFAULT nextval('estimation_history_tran_id_seq'::regclass), -- ID
  estimated_number character varying(30), -- 見積番号
  shop_id smallint, -- 販社ID
  dealer_id smallint, -- ディーラーID
  create_account character varying(20), -- 初回受付担当者アカウント
  model_id smallint, -- モデルID
  item_id smallint, -- 商品ID
  campaign_id smallint, -- キャンペーン商品ID
  item_name character varying(50), -- 商品名
  item_code character varying(15), -- 商品コード
  parts_no1 character varying(4), -- パーツナンバー1
  parts_no2 character varying(4), -- パーツナンバー2
  parts_no3 character varying(4), -- パーツナンバー3
  parts_no4 character varying(4), -- パーツナンバー4
  price_in_tax numeric(8,2), -- 税込価格
  price numeric(8,2), -- 税抜価格
  sale_tag smallint, -- セールタグカラー
  sale_title character varying(100), -- セールタイトル
  img_path character varying(50), -- 商品画像
  tax_id smallint, -- 消費税
  quantity smallint, -- 数量
  install_time numeric(2,2), -- 取付時間（数量×時間）
  item_discount numeric(8,2), -- 商品値引き
  item_paint_price numeric(8,2), -- 商品塗装費
  paint_price numeric(8,2), -- 塗装費
  total_discount numeric(8,2), -- 全体値引き
  memo character varying(100), -- 特記事項
  update_account character varying(20), -- 更新担当者アカウント
  create_date date, -- 作成日
  update_date date, -- 更新日
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT estimation_history_tran_pkey PRIMARY KEY (id),
  CONSTRAINT dealer_rel FOREIGN KEY (dealer_id)
      REFERENCES public.dealer_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT estimation_history_tran_campaign_id_fkey FOREIGN KEY (campaign_id)
      REFERENCES public.campaign_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT estimation_history_tran_model_id_fkey FOREIGN KEY (model_id)
      REFERENCES public.model_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT item_rel FOREIGN KEY (item_id)
      REFERENCES public.item_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT shop_rel FOREIGN KEY (shop_id)
      REFERENCES public.shop_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT tax_rel FOREIGN KEY (tax_id)
      REFERENCES public.tax_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT estimation_history_tran_estimated_number_shop_id_dealer_id__key UNIQUE (estimated_number, shop_id, dealer_id, item_id, campaign_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.estimation_history_tran
  OWNER TO webapp;
COMMENT ON TABLE public.estimation_history_tran
  IS '見積もり履歴テーブル';
COMMENT ON COLUMN public.estimation_history_tran.id IS 'ID';
COMMENT ON COLUMN public.estimation_history_tran.estimated_number IS '見積番号';
COMMENT ON COLUMN public.estimation_history_tran.shop_id IS '販社ID';
COMMENT ON COLUMN public.estimation_history_tran.dealer_id IS 'ディーラーID';
COMMENT ON COLUMN public.estimation_history_tran.create_account IS '初回受付担当者アカウント';
COMMENT ON COLUMN public.estimation_history_tran.model_id IS 'モデルID';
COMMENT ON COLUMN public.estimation_history_tran.item_id IS '商品ID';
COMMENT ON COLUMN public.estimation_history_tran.campaign_id IS 'キャンペーン商品ID';
COMMENT ON COLUMN public.estimation_history_tran.item_name IS '商品名';
COMMENT ON COLUMN public.estimation_history_tran.item_code IS '商品コード';
COMMENT ON COLUMN public.estimation_history_tran.parts_no1 IS 'パーツナンバー1';
COMMENT ON COLUMN public.estimation_history_tran.parts_no2 IS 'パーツナンバー2';
COMMENT ON COLUMN public.estimation_history_tran.parts_no3 IS 'パーツナンバー3';
COMMENT ON COLUMN public.estimation_history_tran.parts_no4 IS 'パーツナンバー4';
COMMENT ON COLUMN public.estimation_history_tran.price_in_tax IS '税込価格';
COMMENT ON COLUMN public.estimation_history_tran.price IS '税抜価格';
COMMENT ON COLUMN public.estimation_history_tran.sale_tag IS 'セールタグカラー';
COMMENT ON COLUMN public.estimation_history_tran.sale_title IS 'セールタイトル';
COMMENT ON COLUMN public.estimation_history_tran.img_path IS '商品画像';
COMMENT ON COLUMN public.estimation_history_tran.tax_id IS '消費税';
COMMENT ON COLUMN public.estimation_history_tran.quantity IS '数量';
COMMENT ON COLUMN public.estimation_history_tran.install_time IS '取付時間（数量×時間）';
COMMENT ON COLUMN public.estimation_history_tran.item_discount IS '商品値引き';
COMMENT ON COLUMN public.estimation_history_tran.item_paint_price IS '商品塗装費';
COMMENT ON COLUMN public.estimation_history_tran.paint_price IS '塗装費';
COMMENT ON COLUMN public.estimation_history_tran.total_discount IS '全体値引き';
COMMENT ON COLUMN public.estimation_history_tran.memo IS '特記事項';
COMMENT ON COLUMN public.estimation_history_tran.update_account IS '更新担当者アカウント';
COMMENT ON COLUMN public.estimation_history_tran.create_date IS '作成日';
COMMENT ON COLUMN public.estimation_history_tran.update_date IS '更新日';
COMMENT ON COLUMN public.estimation_history_tran.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.estimation_history_tran.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.estimation_history_tran.update_user IS '更新者(スタッフID)';

-- Table: public.create_num_tbl

-- DROP TABLE public.create_num_tbl;

CREATE TABLE IF NOT EXISTS public.create_num_tbl
(
  id integer NOT NULL DEFAULT nextval('create_num_tbl_id_seq'::regclass), -- ID
  dealer_id smallint, -- ディーラーID
  max_num smallint, -- 払出番号
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT create_num_tbl_pkey PRIMARY KEY (id),
  CONSTRAINT dealer_rel FOREIGN KEY (dealer_id)
      REFERENCES public.dealer_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.create_num_tbl
  OWNER TO webapp;
COMMENT ON TABLE public.create_num_tbl
  IS '採番テーブル';
COMMENT ON COLUMN public.create_num_tbl.id IS 'ID';
COMMENT ON COLUMN public.create_num_tbl.dealer_id IS 'ディーラーID';
COMMENT ON COLUMN public.create_num_tbl.max_num IS '払出番号';
COMMENT ON COLUMN public.create_num_tbl.create_date IS '作成日';
COMMENT ON COLUMN public.create_num_tbl.update_date IS '更新日';
COMMENT ON COLUMN public.create_num_tbl.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.create_num_tbl.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.create_num_tbl.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.create_num_tbl.update_user IS '更新者(スタッフID)';

-- Table: public.model_code_mst

-- DROP TABLE public.model_code_mst;

CREATE TABLE IF NOT EXISTS public.model_code_mst
(
  id integer NOT NULL DEFAULT nextval('model_code_mst_id_seq'::regclass), -- ID
  model_id smallint, -- 車種マスタのID
  model_code character varying(10), -- モデルコード　モデルコード6桁
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean, -- 一時停止フラグ
  del_flg boolean, -- 削除フラグ
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT model_code_mst_pkey PRIMARY KEY (id),
  CONSTRAINT model_code_mst_model_id_fkey FOREIGN KEY (model_id)
      REFERENCES public.model_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.model_code_mst
  OWNER TO webapp;
COMMENT ON TABLE public.model_code_mst
  IS '車種モデルコードマスタ';
COMMENT ON COLUMN public.model_code_mst.id IS 'ID';
COMMENT ON COLUMN public.model_code_mst.model_id IS '車種マスタのID';
COMMENT ON COLUMN public.model_code_mst.model_code IS 'モデルコード　モデルコード6桁';
COMMENT ON COLUMN public.model_code_mst.create_date IS '作成日';
COMMENT ON COLUMN public.model_code_mst.update_date IS '更新日';
COMMENT ON COLUMN public.model_code_mst.pause_flg IS '一時停止フラグ';
COMMENT ON COLUMN public.model_code_mst.del_flg IS '削除フラグ';
COMMENT ON COLUMN public.model_code_mst.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.model_code_mst.update_user IS '更新者(スタッフID)';

-- Table: public.campaign_view_rel

-- DROP TABLE public.campaign_view_rel;

CREATE TABLE IF NOT EXISTS public.campaign_view_rel
(
  id integer NOT NULL, -- ID
  campaign_id integer NOT NULL, -- キャンペーンID
  dealer_id integer NOT NULL, -- ディーラーID
  create_date date, -- 作成日
  update_date date, -- 更新日
  pause_flg boolean,
  create_user smallint, -- 作成者(スタッフID)
  update_user smallint, -- 更新者(スタッフID)
  CONSTRAINT campaign_view_rel_pkey PRIMARY KEY (id),
  CONSTRAINT campaign_rel FOREIGN KEY (campaign_id)
      REFERENCES public.campaign_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT dealer_rel FOREIGN KEY (dealer_id)
      REFERENCES public.dealer_mst (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT campaign_view_rel_campaign_id_dealer_id_key UNIQUE (campaign_id, dealer_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.campaign_view_rel
  OWNER TO webapp;
COMMENT ON TABLE public.campaign_view_rel
  IS 'キャンペーン配信先関連テーブル';
COMMENT ON COLUMN public.campaign_view_rel.id IS 'ID';
COMMENT ON COLUMN public.campaign_view_rel.campaign_id IS 'キャンペーンID';
COMMENT ON COLUMN public.campaign_view_rel.dealer_id IS 'ディーラーID';
COMMENT ON COLUMN public.campaign_view_rel.create_date IS '作成日';
COMMENT ON COLUMN public.campaign_view_rel.update_date IS '更新日';
COMMENT ON COLUMN public.campaign_view_rel.create_user IS '作成者(スタッフID)';
COMMENT ON COLUMN public.campaign_view_rel.update_user IS '更新者(スタッフID)';



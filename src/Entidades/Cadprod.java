/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cadprod")
public class Cadprod implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "PR_CODSEQ")
    private Integer pr_codseq;

    @Basic(optional = false)
    @Column(name = "PR_IDPRODUTO")
    private Integer pr_idproduto;

    @Column(name = "PR_CODBARRA")
    private BigDecimal pr_codbarra;

    @Column(name = "PR_DESCRICAO")
    private String pr_descricao;

    @Column(name = "PR_IDGRUPO")
    private Integer pr_idgrupo;

    @Column(name = "PR_IDSUBGRUPO")
    private Integer pr_idsubgrupo;

    @Column(name = "PR_PESOLIQUIDO")
    private double pr_pesoliquido;

    @Column(name = "PR_QTDEEMBALAGEM")
    private double pr_qtdeembalagem;

    @Column(name = "PR_ALIQICMS")
    private double pr_aliqicms;

    @Column(name = "PR_ALIQIPI")
    private double pr_aliqipi;

    @Column(name = "PR_MARCA")
    private String pr_marca;

    @Column(name = "PR_CEST")
    private String pr_cest;

    @Column(name = "PR_EMITEETIQUETA")
    private Integer pr_emiteetiqueta;

    @Column(name = "PR_EMITIRETIQALTER")
    private Integer pr_emitiretiqalter;

    @Column(name = "PR_CLASFISCAL")
    private String pr_clasfiscal;

    @Column(name = "PR_UNIDADE")
    private String pr_unidade;

    @Column(name = "PR_DATAULTALTER")
    private Integer pr_dataultalter;

    @Column(name = "PR_SITTRIB")
    private Integer pr_sittrib;

    @Column(name = "PR_PRECODIGITADO")
    private Integer pr_precodigitado;

    @Column(name = "PR_SOBENCOMENDA")
    private Integer pr_sobencomenda;

    @Column(name = "PR_GM")
    private String pr_gm;

    @Column(name = "PR_TEMMINMAX")
    private String pr_temminmax;

    @Column(name = "PR_CONSINTERNET")
    private String pr_consinternet;

    @Column(name = "PR_QTDPCEMB")
    private Integer pr_qtdpcemb;

    @Column(name = "PR_ALIQINTSUBTRIBPR")
    private Integer pr_aliqintsubtribpr;

    @Column(name = "PR_ALIQINTSUBTRIBSC")
    private Integer pr_aliqintsubtribsc;

    @Column(name = "PR_CSTPIS")
    private Integer pr_cstpis;

    @Column(name = "PR_CSTCOFINS")
    private Integer pr_cstcofins;

    @Column(name = "PR_CST_A")
    private Integer pr_cst_a;

    @Column(name = "PR_PRDEXCLUSIVOKINTA")
    private String pr_prdexclusivokinta;

    @Column(name = "PR_CODBARRAOK")
    private String pr_codbarraok;

    @Column(name = "PR_TIPOPROD")
    private Integer pr_tipoprod;

    @Column(name = "PR_DIASESTOQUE")
    private Integer pr_diasestoque;

    @Column(name = "PR_PRZENTSOBENC")
    private Integer pr_przentsobenc;

    @Column(name = "PR_FORNEC")
    private Integer pr_fornec;

    @Column(name = "PR_DIASMINEST")
    private Integer pr_diasminest;

    @Column(name = "PR_MEDIAVENDA")
    private double pr_mediavenda;

    @Column(name = "PR_IDSGFORNEC")
    private Integer pr_idsgfornec;

    @Column(name = "PR_VENSOMENTELJ")
    private String pr_vensomentelj;

    @Column(name = "PR_PRODCOMPOSTO1")
    private Integer pr_prodcomposto1;

    @Column(name = "PR_DIVISORTRANSF")
    private Integer pr_divisortransf;

    @Column(name = "PR_CODPAITRANSF")
    private Integer pr_codpaitransf;

    @Column(name = "PR_PRODVINCULADO")
    private Integer pr_prodvinculado;

    @Column(name = "PR_FORADELINHA")
    private String pr_foradelinha;

    @Column(name = "PR_PRODFAB")
    private String pr_prodfab;

    @Column(name = "PR_SERVICO")
    private String pr_servico;

    @Column(name = "PR_PERCCOMISVEND")
    private double pr_perccomisvend;

    @Column(name = "PR_PRODDESMEMBRADO")
    private Integer pr_proddesmembrado;

    @Column(name = "PR_DESMEMBRADO")
    private String pr_desmembrado;

    @Column(name = "PR_CLASMG")
    private String pr_clasmg;

    @Column(name = "PR_TAMCM3")
    private double pr_tamcm3;

    @Column(name = "PR_EMBALAGEM")
    private String pr_embalagem;

    @Column(name = "PR_DIMENSAO")
    private String pr_dimensao;

    @Column(name = "PR_COR")
    private String pr_cor;

    @Column(name = "PR_LIBERAESTOQUE")
    private String pr_liberaestoque;

    @Column(name = "PR_TIPOETIQSEG")
    private Integer pr_tipoetiqseg;

    @Column(name = "PR_MODETIQPRECO")
    private Integer pr_modetiqpreco;

    @Column(name = "PR_CODBARRAIND")
    private double pr_codbarraind;

    @Column(name = "PR_QTDEMBIND")
    private double pr_qtdembind;

    @Column(name = "PR_OBSERVACOES")
    private String pr_observacoes;

    @Column(name = "PR_LJCOMPILHA")
    private String pr_ljcompilha;

    @Column(name = "PR_PIS")
    private double pr_pis;

    @Column(name = "PR_COFINS")
    private double pr_cofins;

    @Column(name = "PR_ALIQICMSRG3")
    private double pr_aliqicmsrg3;

    @Column(name = "PR_PRODNOVO")
    private String pr_prodnovo;

    @Column(name = "PR_DESCRSEMAC")
    private String pr_descrsemac;

    @Column(name = "PR_MARCASEMAC")
    private String pr_marcasemac;

    @Column(name = "PR_UNIDSEMAC")
    private String pr_unidsemac;

    @Column(name = "PR_PRZENTSOBENCKINTA")
    private Integer pr_przentsobenckinta;

    @Column(name = "PR_PERREDBASEST")
    private double pr_perredbasest;

    @Column(name = "PR_PERREDBASESTRG3")
    private double pr_perredbasestrg3;

    @Column(name = "PR_DESCRRES")
    private String pr_descrres;

    @Column(name = "PR_SITTRIBRG3")
    private Integer pr_sittribrg3;

    @Column(name = "PR_PRDBALASOBENCKINTA")
    private String pr_prdbalasobenckinta;

    @Column(name = "PR_PRDBALAKINTA")
    private String pr_prdbalakinta;

    @Column(name = "PR_PRDBLOQCALCTBVINC")
    private String pr_prdbloqcalctbvinc;

    @Column(name = "PR_TEMDIFALIQSC")
    private String pr_temdifaliqsc;

    @Column(name = "PR_ALTURA")
    private double pr_altura;

    @Column(name = "PR_LARGURA")
    private double pr_largura;

    @Column(name = "PR_COMPRIMENTO")
    private double pr_comprimento;

    @Column(name = "PR_MADEIRABRUTA")
    private String pr_madeirabruta;

    @Column(name = "PR_BLOQDEP")
    private String pr_bloqdep;

    @Column(name = "PR_CODBARRAEMB")
    private double pr_codbarraemb;

    @Column(name = "PR_MADEIRABENEF")
    private String pr_madeirabenef;

    @Column(name = "PR_TIPOMADEIRA")
    private Integer pr_tipomadeira;

    @Column(name = "PR_PERREDBASEICMST")
    private double pr_perredbaseicmst;

    @Column(name = "PR_PERREDBASEICMSTRG3")
    private double pr_perredbaseicmstrg3;

    @Column(name = "PR_MARGEMSUBTRIB")
    private double pr_margemsubtrib;

    @Column(name = "PR_FOTO")
    private String pr_foto;

    @Column(name = "PR_FORRODEPVC")
    private String pr_forrodepvc;

    @Column(name = "PR_IDNIVPRWEB")
    private Integer pr_idnivprweb;

    @Column(name = "PR_IDGRUPOS")
    private Integer pr_idgrupos;

    @Column(name = "PR_IDPROD")
    private Integer pr_idprod;

    @Column(name = "PR_IDCLASSE")
    private Integer pr_idclasse;

    @Column(name = "PR_IDTAMANHO")
    private Integer pr_idtamanho;

    @Column(name = "PR_IDGENERO")
    private Integer pr_idgenero;

    @Column(name = "PR_IDLINHA")
    private Integer pr_idlinha;

    @Column(name = "PR_DESCRESPECIFWEB")
    private String pr_descrespecifweb;

    @Column(name = "PR_IDPROCESSO")
    private Integer pr_idprocesso;

    @Column(name = "PR_PRZENTREGA")
    private Integer pr_przentrega;

    @Column(name = "PR_DESCRESPECIFLJ")
    private String pr_descrespeciflj;

    @Column(name = "PR_TAMEMB")
    private double pr_tamemb;

    @Column(name = "PR_CODNCM")
    private Integer pr_codncm;

    @Column(name = "PR_QTDLT")
    private double pr_qtdlt;

    @Column(name = "PR_MMTAM")
    private String pr_mmtam;

    @Column(name = "PR_MMGANCHO")
    private Integer pr_mmgancho;

    @Column(name = "PR_FREQCOMPRAEMDIAS")
    private Integer pr_freqcompraemdias;

    @Column(name = "PR_ALIQIPIVEN")
    private double pr_aliqipiven;

    @Column(name = "PR_DATACAD")
    private Integer pr_datacad;

    @Column(name = "PR_PERCCOMISVENDCAMP")
    private double pr_perccomisvendcamp;

    @Column(name = "PR_GERARV3")
    private String pr_gerarv3;

    @Column(name = "PR_CODSERVICO")
    private Integer pr_codservico;

    @Column(name = "PR_TRIBORIDEST")
    private String pr_triboridest;

    @Column(name = "PR_ALIQISS")
    private double pr_aliqiss;

    @Column(name = "PR_QTDEUNIDIND")
    private double pr_qtdeunidind;

    @Column(name = "PR_QTDEEMBBALA")
    private double pr_qtdeembbala;

    @Column(name = "PR_IMPTERMOMEDICAO")
    private String pr_imptermomedicao;

    @Column(name = "PR_IDCODCLASCOMPROD")
    private Integer pr_idcodclascomprod;

    @Column(name = "PR_CNAE")
    private Integer pr_cnae;

    @Column(name = "PR_PRIMEIROPRECO")
    private String pr_primeiropreco;

    @Column(name = "PR_MARGEMSUBTRIBRG3")
    private double pr_margemsubtribrg3;

    @Column(name = "PR_SERVICO_TERCEIRO")
    private String pr_servico_terceiro;

    @Column(name = "PR_DESIGN")
    private String pr_design;

    @Column(name = "PR_ETIQCODBARRA")
    private String pr_etiqcodbarra;

    @Column(name = "PR_MVA_ORIGINALPR")
    private double pr_mva_originalpr;

    @Column(name = "PR_MVA_ORIGINALSC")
    private double pr_mva_originalsc;

    @Column(name = "PR_IMG_PRODUTO")
    private String pr_img_produto;

    @Column(name = "PR_INATIVO")
    private String pr_inativo;

    @Column(name = "PR_CONTROLA_TONALIDADE")
    private String pr_controla_tonalidade;

    @Column(name = "PR_CONTROLA_VALIDADE")
    private String pr_controla_validade;

    @Column(name = "PR_ATUALIZAVTEX")
    private Integer pr_atualizavtex;

    @Column(name = "PR_DATETIMEINCLUSAOVTEX")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pr_datetimeinclusaovtex;

    @Column(name = "PR_PESO_REAL")
    private double pr_peso_real;

    @Column(name = "PR_ALTURA_REAL")
    private double pr_altura_real;

    @Column(name = "PR_LARGURA_REAL")
    private double pr_largura_real;

    @Column(name = "PR_COMPRIMENTO_REAL")
    private double pr_comprimento_real;

    @Column(name = "PR_VENDA_SOMENTE_KIT")
    private String pr_venda_somente_kit;

    public Integer getpr_idproduto() {
        return pr_idproduto;
    }

    public void setpr_idproduto(Integer pr_idproduto) {
        this.pr_idproduto = pr_idproduto;
    }

    public BigDecimal getPr_codbarra() {
        return pr_codbarra;
    }

    public void setPr_codbarra(BigDecimal pr_codbarra) {
        this.pr_codbarra = pr_codbarra;
    }

    


    public Integer getpr_codseq() {
        return pr_codseq;
    }

    public void setpr_codseq(Integer pr_codseq) {
        this.pr_codseq = pr_codseq;
    }

    public String getpr_descricao() {
        return pr_descricao;
    }

    public void setpr_descricao(String pr_descricao) {
        this.pr_descricao = pr_descricao;
    }

    public Integer getpr_idgrupo() {
        return pr_idgrupo;
    }

    public void setpr_idgrupo(Integer pr_idgrupo) {
        this.pr_idgrupo = pr_idgrupo;
    }

    public Integer getpr_idsubgrupo() {
        return pr_idsubgrupo;
    }

    public void setpr_idsubgrupo(Integer pr_idsubgrupo) {
        this.pr_idsubgrupo = pr_idsubgrupo;
    }

    public double getpr_pesoliquido() {
        return pr_pesoliquido;
    }

    public void setpr_pesoliquido(double pr_pesoliquido) {
        this.pr_pesoliquido = pr_pesoliquido;
    }

    public double getpr_qtdeembalagem() {
        return pr_qtdeembalagem;
    }

    public void setpr_qtdeembalagem(double pr_qtdeembalagem) {
        this.pr_qtdeembalagem = pr_qtdeembalagem;
    }

    public double getpr_aliqicms() {
        return pr_aliqicms;
    }

    public void setpr_aliqicms(double pr_aliqicms) {
        this.pr_aliqicms = pr_aliqicms;
    }

    public double getpr_aliqipi() {
        return pr_aliqipi;
    }

    public void setpr_aliqipi(double pr_aliqipi) {
        this.pr_aliqipi = pr_aliqipi;
    }

    public String getpr_marca() {
        return pr_marca;
    }

    public void setpr_marca(String pr_marca) {
        this.pr_marca = pr_marca;
    }

    public String getpr_cest() {
        return pr_cest;
    }

    public void setpr_cest(String pr_cest) {
        this.pr_cest = pr_cest;
    }

    public Integer getpr_emiteetiqueta() {
        return pr_emiteetiqueta;
    }

    public void setpr_emiteetiqueta(Integer pr_emiteetiqueta) {
        this.pr_emiteetiqueta = pr_emiteetiqueta;
    }

    public Integer getpr_emitiretiqalter() {
        return pr_emitiretiqalter;
    }

    public void setpr_emitiretiqalter(Integer pr_emitiretiqalter) {
        this.pr_emitiretiqalter = pr_emitiretiqalter;
    }

    public String getpr_clasfiscal() {
        return pr_clasfiscal;
    }

    public void setpr_clasfiscal(String pr_clasfiscal) {
        this.pr_clasfiscal = pr_clasfiscal;
    }

    public String getpr_unidade() {
        return pr_unidade;
    }

    public void setpr_unidade(String pr_unidade) {
        this.pr_unidade = pr_unidade;
    }

    public Integer getpr_dataultalter() {
        return pr_dataultalter;
    }

    public void setpr_dataultalter(Integer pr_dataultalter) {
        this.pr_dataultalter = pr_dataultalter;
    }

    public Integer getpr_sittrib() {
        return pr_sittrib;
    }

    public void setpr_sittrib(Integer pr_sittrib) {
        this.pr_sittrib = pr_sittrib;
    }

    public Integer getpr_precodigitado() {
        return pr_precodigitado;
    }

    public void setpr_precodigitado(Integer pr_precodigitado) {
        this.pr_precodigitado = pr_precodigitado;
    }

    public Integer getpr_sobencomenda() {
        return pr_sobencomenda;
    }

    public void setpr_sobencomenda(Integer pr_sobencomenda) {
        this.pr_sobencomenda = pr_sobencomenda;
    }

    public String getpr_gm() {
        return pr_gm;
    }

    public void setpr_gm(String pr_gm) {
        this.pr_gm = pr_gm;
    }

    public String getpr_temminmax() {
        return pr_temminmax;
    }

    public void setpr_temminmax(String pr_temminmax) {
        this.pr_temminmax = pr_temminmax;
    }

    public String getpr_consinternet() {
        return pr_consinternet;
    }

    public void setpr_consinternet(String pr_consinternet) {
        this.pr_consinternet = pr_consinternet;
    }

    public Integer getpr_qtdpcemb() {
        return pr_qtdpcemb;
    }

    public void setpr_qtdpcemb(Integer pr_qtdpcemb) {
        this.pr_qtdpcemb = pr_qtdpcemb;
    }

    public Integer getpr_aliqintsubtribpr() {
        return pr_aliqintsubtribpr;
    }

    public void setpr_aliqintsubtribpr(Integer pr_aliqintsubtribpr) {
        this.pr_aliqintsubtribpr = pr_aliqintsubtribpr;
    }

    public Integer getpr_aliqintsubtribsc() {
        return pr_aliqintsubtribsc;
    }

    public void setpr_aliqintsubtribsc(Integer pr_aliqintsubtribsc) {
        this.pr_aliqintsubtribsc = pr_aliqintsubtribsc;
    }

    public Integer getpr_cstpis() {
        return pr_cstpis;
    }

    public void setpr_cstpis(Integer pr_cstpis) {
        this.pr_cstpis = pr_cstpis;
    }

    public Integer getpr_cstcofins() {
        return pr_cstcofins;
    }

    public void setpr_cstcofins(Integer pr_cstcofins) {
        this.pr_cstcofins = pr_cstcofins;
    }

    public Integer getpr_cst_a() {
        return pr_cst_a;
    }

    public void setpr_cst_a(Integer pr_cst_a) {
        this.pr_cst_a = pr_cst_a;
    }

    public String getpr_prdexclusivokinta() {
        return pr_prdexclusivokinta;
    }

    public void setpr_prdexclusivokinta(String pr_prdexclusivokinta) {
        this.pr_prdexclusivokinta = pr_prdexclusivokinta;
    }

    public String getpr_codbarraok() {
        return pr_codbarraok;
    }

    public void setpr_codbarraok(String pr_codbarraok) {
        this.pr_codbarraok = pr_codbarraok;
    }

    public Integer getpr_tipoprod() {
        return pr_tipoprod;
    }

    public void setpr_tipoprod(Integer pr_tipoprod) {
        this.pr_tipoprod = pr_tipoprod;
    }

    public Integer getpr_diasestoque() {
        return pr_diasestoque;
    }

    public void setpr_diasestoque(Integer pr_diasestoque) {
        this.pr_diasestoque = pr_diasestoque;
    }

    public Integer getpr_przentsobenc() {
        return pr_przentsobenc;
    }

    public void setpr_przentsobenc(Integer pr_przentsobenc) {
        this.pr_przentsobenc = pr_przentsobenc;
    }

    public Integer getpr_fornec() {
        return pr_fornec;
    }

    public void setpr_fornec(Integer pr_fornec) {
        this.pr_fornec = pr_fornec;
    }

    public Integer getpr_diasminest() {
        return pr_diasminest;
    }

    public void setpr_diasminest(Integer pr_diasminest) {
        this.pr_diasminest = pr_diasminest;
    }

    public double getpr_mediavenda() {
        return pr_mediavenda;
    }

    public void setpr_mediavenda(double pr_mediavenda) {
        this.pr_mediavenda = pr_mediavenda;
    }

    public Integer getpr_idsgfornec() {
        return pr_idsgfornec;
    }

    public void setpr_idsgfornec(Integer pr_idsgfornec) {
        this.pr_idsgfornec = pr_idsgfornec;
    }

    public String getpr_vensomentelj() {
        return pr_vensomentelj;
    }

    public void setpr_vensomentelj(String pr_vensomentelj) {
        this.pr_vensomentelj = pr_vensomentelj;
    }

    public Integer getpr_prodcomposto1() {
        return pr_prodcomposto1;
    }

    public void setpr_prodcomposto1(Integer pr_prodcomposto1) {
        this.pr_prodcomposto1 = pr_prodcomposto1;
    }

    public Integer getpr_divisortransf() {
        return pr_divisortransf;
    }

    public void setpr_divisortransf(Integer pr_divisortransf) {
        this.pr_divisortransf = pr_divisortransf;
    }

    public Integer getpr_codpaitransf() {
        return pr_codpaitransf;
    }

    public void setpr_codpaitransf(Integer pr_codpaitransf) {
        this.pr_codpaitransf = pr_codpaitransf;
    }

    public Integer getpr_prodvinculado() {
        return pr_prodvinculado;
    }

    public void setpr_prodvinculado(Integer pr_prodvinculado) {
        this.pr_prodvinculado = pr_prodvinculado;
    }

    public String getpr_foradelinha() {
        return pr_foradelinha;
    }

    public void setpr_foradelinha(String pr_foradelinha) {
        this.pr_foradelinha = pr_foradelinha;
    }

    public String getpr_prodfab() {
        return pr_prodfab;
    }

    public void setpr_prodfab(String pr_prodfab) {
        this.pr_prodfab = pr_prodfab;
    }

    public String getpr_servico() {
        return pr_servico;
    }

    public void setpr_servico(String pr_servico) {
        this.pr_servico = pr_servico;
    }

    public double getpr_perccomisvend() {
        return pr_perccomisvend;
    }

    public void setpr_perccomisvend(double pr_perccomisvend) {
        this.pr_perccomisvend = pr_perccomisvend;
    }

    public Integer getpr_proddesmembrado() {
        return pr_proddesmembrado;
    }

    public void setpr_proddesmembrado(Integer pr_proddesmembrado) {
        this.pr_proddesmembrado = pr_proddesmembrado;
    }

    public String getpr_desmembrado() {
        return pr_desmembrado;
    }

    public void setpr_desmembrado(String pr_desmembrado) {
        this.pr_desmembrado = pr_desmembrado;
    }

    public String getpr_clasmg() {
        return pr_clasmg;
    }

    public void setpr_clasmg(String pr_clasmg) {
        this.pr_clasmg = pr_clasmg;
    }

    public double getpr_tamcm3() {
        return pr_tamcm3;
    }

    public void setpr_tamcm3(double pr_tamcm3) {
        this.pr_tamcm3 = pr_tamcm3;
    }

    public String getpr_embalagem() {
        return pr_embalagem;
    }

    public void setpr_embalagem(String pr_embalagem) {
        this.pr_embalagem = pr_embalagem;
    }

    public String getpr_dimensao() {
        return pr_dimensao;
    }

    public void setpr_dimensao(String pr_dimensao) {
        this.pr_dimensao = pr_dimensao;
    }

    public String getpr_cor() {
        return pr_cor;
    }

    public void setpr_cor(String pr_cor) {
        this.pr_cor = pr_cor;
    }

    public String getpr_liberaestoque() {
        return pr_liberaestoque;
    }

    public void setpr_liberaestoque(String pr_liberaestoque) {
        this.pr_liberaestoque = pr_liberaestoque;
    }

    public Integer getpr_tipoetiqseg() {
        return pr_tipoetiqseg;
    }

    public void setpr_tipoetiqseg(Integer pr_tipoetiqseg) {
        this.pr_tipoetiqseg = pr_tipoetiqseg;
    }

    public Integer getpr_modetiqpreco() {
        return pr_modetiqpreco;
    }

    public void setpr_modetiqpreco(Integer pr_modetiqpreco) {
        this.pr_modetiqpreco = pr_modetiqpreco;
    }

    public double getpr_codbarraind() {
        return pr_codbarraind;
    }

    public void setpr_codbarraind(double pr_codbarraind) {
        this.pr_codbarraind = pr_codbarraind;
    }

    public double getpr_qtdembind() {
        return pr_qtdembind;
    }

    public void setpr_qtdembind(double pr_qtdembind) {
        this.pr_qtdembind = pr_qtdembind;
    }

    public String getpr_observacoes() {
        return pr_observacoes;
    }

    public void setpr_observacoes(String pr_observacoes) {
        this.pr_observacoes = pr_observacoes;
    }

    public String getpr_ljcompilha() {
        return pr_ljcompilha;
    }

    public void setpr_ljcompilha(String pr_ljcompilha) {
        this.pr_ljcompilha = pr_ljcompilha;
    }

    public double getpr_pis() {
        return pr_pis;
    }

    public void setpr_pis(double pr_pis) {
        this.pr_pis = pr_pis;
    }

    public double getpr_cofins() {
        return pr_cofins;
    }

    public void setpr_cofins(double pr_cofins) {
        this.pr_cofins = pr_cofins;
    }

    public double getpr_aliqicmsrg3() {
        return pr_aliqicmsrg3;
    }

    public void setpr_aliqicmsrg3(double pr_aliqicmsrg3) {
        this.pr_aliqicmsrg3 = pr_aliqicmsrg3;
    }

    public String getpr_prodnovo() {
        return pr_prodnovo;
    }

    public void setpr_prodnovo(String pr_prodnovo) {
        this.pr_prodnovo = pr_prodnovo;
    }

    public String getpr_descrsemac() {
        return pr_descrsemac;
    }

    public void setpr_descrsemac(String pr_descrsemac) {
        this.pr_descrsemac = pr_descrsemac;
    }

    public String getpr_marcasemac() {
        return pr_marcasemac;
    }

    public void setpr_marcasemac(String pr_marcasemac) {
        this.pr_marcasemac = pr_marcasemac;
    }

    public String getpr_unidsemac() {
        return pr_unidsemac;
    }

    public void setpr_unidsemac(String pr_unidsemac) {
        this.pr_unidsemac = pr_unidsemac;
    }

    public Integer getpr_przentsobenckinta() {
        return pr_przentsobenckinta;
    }

    public void setpr_przentsobenckinta(Integer pr_przentsobenckinta) {
        this.pr_przentsobenckinta = pr_przentsobenckinta;
    }

    public double getpr_perredbasest() {
        return pr_perredbasest;
    }

    public void setpr_perredbasest(double pr_perredbasest) {
        this.pr_perredbasest = pr_perredbasest;
    }

    public double getpr_perredbasestrg3() {
        return pr_perredbasestrg3;
    }

    public void setpr_perredbasestrg3(double pr_perredbasestrg3) {
        this.pr_perredbasestrg3 = pr_perredbasestrg3;
    }

    public String getpr_descrres() {
        return pr_descrres;
    }

    public void setpr_descrres(String pr_descrres) {
        this.pr_descrres = pr_descrres;
    }

    public Integer getpr_sittribrg3() {
        return pr_sittribrg3;
    }

    public void setpr_sittribrg3(Integer pr_sittribrg3) {
        this.pr_sittribrg3 = pr_sittribrg3;
    }

    public String getpr_prdbalasobenckinta() {
        return pr_prdbalasobenckinta;
    }

    public void setpr_prdbalasobenckinta(String pr_prdbalasobenckinta) {
        this.pr_prdbalasobenckinta = pr_prdbalasobenckinta;
    }

    public String getpr_prdbalakinta() {
        return pr_prdbalakinta;
    }

    public void setpr_prdbalakinta(String pr_prdbalakinta) {
        this.pr_prdbalakinta = pr_prdbalakinta;
    }

    public String getpr_prdbloqcalctbvinc() {
        return pr_prdbloqcalctbvinc;
    }

    public void setpr_prdbloqcalctbvinc(String pr_prdbloqcalctbvinc) {
        this.pr_prdbloqcalctbvinc = pr_prdbloqcalctbvinc;
    }

    public String getpr_temdifaliqsc() {
        return pr_temdifaliqsc;
    }

    public void setpr_temdifaliqsc(String pr_temdifaliqsc) {
        this.pr_temdifaliqsc = pr_temdifaliqsc;
    }

    public double getpr_altura() {
        return pr_altura;
    }

    public void setpr_altura(double pr_altura) {
        this.pr_altura = pr_altura;
    }

    public double getpr_largura() {
        return pr_largura;
    }

    public void setpr_largura(double pr_largura) {
        this.pr_largura = pr_largura;
    }

    public double getpr_comprimento() {
        return pr_comprimento;
    }

    public void setpr_comprimento(double pr_comprimento) {
        this.pr_comprimento = pr_comprimento;
    }

    public String getpr_madeirabruta() {
        return pr_madeirabruta;
    }

    public void setpr_madeirabruta(String pr_madeirabruta) {
        this.pr_madeirabruta = pr_madeirabruta;
    }

    public String getpr_bloqdep() {
        return pr_bloqdep;
    }

    public void setpr_bloqdep(String pr_bloqdep) {
        this.pr_bloqdep = pr_bloqdep;
    }

    public double getpr_codbarraemb() {
        return pr_codbarraemb;
    }

    public void setpr_codbarraemb(double pr_codbarraemb) {
        this.pr_codbarraemb = pr_codbarraemb;
    }

    public String getpr_madeirabenef() {
        return pr_madeirabenef;
    }

    public void setpr_madeirabenef(String pr_madeirabenef) {
        this.pr_madeirabenef = pr_madeirabenef;
    }

    public Integer getpr_tipomadeira() {
        return pr_tipomadeira;
    }

    public void setpr_tipomadeira(Integer pr_tipomadeira) {
        this.pr_tipomadeira = pr_tipomadeira;
    }

    public double getpr_perredbaseicmst() {
        return pr_perredbaseicmst;
    }

    public void setpr_perredbaseicmst(double pr_perredbaseicmst) {
        this.pr_perredbaseicmst = pr_perredbaseicmst;
    }

    public double getpr_perredbaseicmstrg3() {
        return pr_perredbaseicmstrg3;
    }

    public void setpr_perredbaseicmstrg3(double pr_perredbaseicmstrg3) {
        this.pr_perredbaseicmstrg3 = pr_perredbaseicmstrg3;
    }

    public double getpr_margemsubtrib() {
        return pr_margemsubtrib;
    }

    public void setpr_margemsubtrib(double pr_margemsubtrib) {
        this.pr_margemsubtrib = pr_margemsubtrib;
    }

    public String getpr_foto() {
        return pr_foto;
    }

    public void setpr_foto(String pr_foto) {
        this.pr_foto = pr_foto;
    }

    public String getpr_forrodepvc() {
        return pr_forrodepvc;
    }

    public void setpr_forrodepvc(String pr_forrodepvc) {
        this.pr_forrodepvc = pr_forrodepvc;
    }

    public Integer getpr_idnivprweb() {
        return pr_idnivprweb;
    }

    public void setpr_idnivprweb(Integer pr_idnivprweb) {
        this.pr_idnivprweb = pr_idnivprweb;
    }

    public Integer getpr_idgrupos() {
        return pr_idgrupos;
    }

    public void setpr_idgrupos(Integer pr_idgrupos) {
        this.pr_idgrupos = pr_idgrupos;
    }

    public Integer getpr_idprod() {
        return pr_idprod;
    }

    public void setpr_idprod(Integer pr_idprod) {
        this.pr_idprod = pr_idprod;
    }

    public Integer getpr_idclasse() {
        return pr_idclasse;
    }

    public void setpr_idclasse(Integer pr_idclasse) {
        this.pr_idclasse = pr_idclasse;
    }

    public Integer getpr_idtamanho() {
        return pr_idtamanho;
    }

    public void setpr_idtamanho(Integer pr_idtamanho) {
        this.pr_idtamanho = pr_idtamanho;
    }

    public Integer getpr_idgenero() {
        return pr_idgenero;
    }

    public void setpr_idgenero(Integer pr_idgenero) {
        this.pr_idgenero = pr_idgenero;
    }

    public Integer getpr_idlinha() {
        return pr_idlinha;
    }

    public void setpr_idlinha(Integer pr_idlinha) {
        this.pr_idlinha = pr_idlinha;
    }

    public String getpr_descrespecifweb() {
        return pr_descrespecifweb;
    }

    public void setpr_descrespecifweb(String pr_descrespecifweb) {
        this.pr_descrespecifweb = pr_descrespecifweb;
    }

    public Integer getpr_idprocesso() {
        return pr_idprocesso;
    }

    public void setpr_idprocesso(Integer pr_idprocesso) {
        this.pr_idprocesso = pr_idprocesso;
    }

    public Integer getpr_przentrega() {
        return pr_przentrega;
    }

    public void setpr_przentrega(Integer pr_przentrega) {
        this.pr_przentrega = pr_przentrega;
    }

    public String getpr_descrespeciflj() {
        return pr_descrespeciflj;
    }

    public void setpr_descrespeciflj(String pr_descrespeciflj) {
        this.pr_descrespeciflj = pr_descrespeciflj;
    }

    public double getpr_tamemb() {
        return pr_tamemb;
    }

    public void setpr_tamemb(double pr_tamemb) {
        this.pr_tamemb = pr_tamemb;
    }

    public Integer getpr_codncm() {
        return pr_codncm;
    }

    public void setpr_codncm(Integer pr_codncm) {
        this.pr_codncm = pr_codncm;
    }

    public double getpr_qtdlt() {
        return pr_qtdlt;
    }

    public void setpr_qtdlt(double pr_qtdlt) {
        this.pr_qtdlt = pr_qtdlt;
    }

    public String getpr_mmtam() {
        return pr_mmtam;
    }

    public void setpr_mmtam(String pr_mmtam) {
        this.pr_mmtam = pr_mmtam;
    }

    public Integer getpr_mmgancho() {
        return pr_mmgancho;
    }

    public void setpr_mmgancho(Integer pr_mmgancho) {
        this.pr_mmgancho = pr_mmgancho;
    }

    public Integer getpr_freqcompraemdias() {
        return pr_freqcompraemdias;
    }

    public void setpr_freqcompraemdias(Integer pr_freqcompraemdias) {
        this.pr_freqcompraemdias = pr_freqcompraemdias;
    }

    public double getpr_aliqipiven() {
        return pr_aliqipiven;
    }

    public void setpr_aliqipiven(double pr_aliqipiven) {
        this.pr_aliqipiven = pr_aliqipiven;
    }

    public Integer getpr_datacad() {
        return pr_datacad;
    }

    public void setpr_datacad(Integer pr_datacad) {
        this.pr_datacad = pr_datacad;
    }

    public double getpr_perccomisvendcamp() {
        return pr_perccomisvendcamp;
    }

    public void setpr_perccomisvendcamp(double pr_perccomisvendcamp) {
        this.pr_perccomisvendcamp = pr_perccomisvendcamp;
    }

    public String getpr_gerarv3() {
        return pr_gerarv3;
    }

    public void setpr_gerarv3(String pr_gerarv3) {
        this.pr_gerarv3 = pr_gerarv3;
    }

    public Integer getpr_codservico() {
        return pr_codservico;
    }

    public void setpr_codservico(Integer pr_codservico) {
        this.pr_codservico = pr_codservico;
    }

    public String getpr_triboridest() {
        return pr_triboridest;
    }

    public void setpr_triboridest(String pr_triboridest) {
        this.pr_triboridest = pr_triboridest;
    }

    public double getpr_aliqiss() {
        return pr_aliqiss;
    }

    public void setpr_aliqiss(double pr_aliqiss) {
        this.pr_aliqiss = pr_aliqiss;
    }

    public double getpr_qtdeunidind() {
        return pr_qtdeunidind;
    }

    public void setpr_qtdeunidind(double pr_qtdeunidind) {
        this.pr_qtdeunidind = pr_qtdeunidind;
    }

    public double getpr_qtdeembbala() {
        return pr_qtdeembbala;
    }

    public void setpr_qtdeembbala(double pr_qtdeembbala) {
        this.pr_qtdeembbala = pr_qtdeembbala;
    }

    public String getpr_imptermomedicao() {
        return pr_imptermomedicao;
    }

    public void setpr_imptermomedicao(String pr_imptermomedicao) {
        this.pr_imptermomedicao = pr_imptermomedicao;
    }

    public Integer getpr_idcodclascomprod() {
        return pr_idcodclascomprod;
    }

    public void setpr_idcodclascomprod(Integer pr_idcodclascomprod) {
        this.pr_idcodclascomprod = pr_idcodclascomprod;
    }

    public Integer getpr_cnae() {
        return pr_cnae;
    }

    public void setpr_cnae(Integer pr_cnae) {
        this.pr_cnae = pr_cnae;
    }

    public String getpr_primeiropreco() {
        return pr_primeiropreco;
    }

    public void setpr_primeiropreco(String pr_primeiropreco) {
        this.pr_primeiropreco = pr_primeiropreco;
    }

    public double getpr_margemsubtribrg3() {
        return pr_margemsubtribrg3;
    }

    public void setpr_margemsubtribrg3(double pr_margemsubtribrg3) {
        this.pr_margemsubtribrg3 = pr_margemsubtribrg3;
    }

    public String getpr_servico_terceiro() {
        return pr_servico_terceiro;
    }

    public void setpr_servico_terceiro(String pr_servico_terceiro) {
        this.pr_servico_terceiro = pr_servico_terceiro;
    }

    public String getpr_design() {
        return pr_design;
    }

    public void setpr_design(String pr_design) {
        this.pr_design = pr_design;
    }

    public String getpr_etiqcodbarra() {
        return pr_etiqcodbarra;
    }

    public void setpr_etiqcodbarra(String pr_etiqcodbarra) {
        this.pr_etiqcodbarra = pr_etiqcodbarra;
    }

    public double getpr_mva_originalpr() {
        return pr_mva_originalpr;
    }

    public void setpr_mva_originalpr(double pr_mva_originalpr) {
        this.pr_mva_originalpr = pr_mva_originalpr;
    }

    public double getpr_mva_originalsc() {
        return pr_mva_originalsc;
    }

    public void setpr_mva_originalsc(double pr_mva_originalsc) {
        this.pr_mva_originalsc = pr_mva_originalsc;
    }

    public String getpr_img_produto() {
        return pr_img_produto;
    }

    public void setpr_img_produto(String pr_img_produto) {
        this.pr_img_produto = pr_img_produto;
    }

    public String getpr_inativo() {
        return pr_inativo;
    }

    public void setpr_inativo(String pr_inativo) {
        this.pr_inativo = pr_inativo;
    }

    public String getpr_controla_tonalidade() {
        return pr_controla_tonalidade;
    }

    public void setpr_controla_tonalidade(String pr_controla_tonalidade) {
        this.pr_controla_tonalidade = pr_controla_tonalidade;
    }

    public String getpr_controla_validade() {
        return pr_controla_validade;
    }

    public void setpr_controla_validade(String pr_controla_validade) {
        this.pr_controla_validade = pr_controla_validade;
    }

    public Integer getpr_atualizavtex() {
        return pr_atualizavtex;
    }

    public void setpr_atualizavtex(Integer pr_atualizavtex) {
        this.pr_atualizavtex = pr_atualizavtex;
    }

    public Date getpr_datetimeinclusaovtex() {
        return pr_datetimeinclusaovtex;
    }

    public void setpr_datetimeinclusaovtex(Date pr_datetimeinclusaovtex) {
        this.pr_datetimeinclusaovtex = pr_datetimeinclusaovtex;
    }

    public double getpr_peso_real() {
        return pr_peso_real;
    }

    public void setpr_peso_real(double pr_peso_real) {
        this.pr_peso_real = pr_peso_real;
    }

    public double getpr_altura_real() {
        return pr_altura_real;
    }

    public void setpr_altura_real(double pr_altura_real) {
        this.pr_altura_real = pr_altura_real;
    }

    public double getpr_largura_real() {
        return pr_largura_real;
    }

    public void setpr_largura_real(double pr_largura_real) {
        this.pr_largura_real = pr_largura_real;
    }

    public double getpr_comprimento_real() {
        return pr_comprimento_real;
    }

    public void setpr_comprimento_real(double pr_comprimento_real) {
        this.pr_comprimento_real = pr_comprimento_real;
    }

    public String getpr_venda_somente_kit() {
        return pr_venda_somente_kit;
    }

    public void setpr_venda_somente_kit(String pr_venda_somente_kit) {
        this.pr_venda_somente_kit = pr_venda_somente_kit;
    }
}

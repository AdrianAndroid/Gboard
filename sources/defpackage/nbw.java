package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: nbw  reason: default package */
/* loaded from: classes2.dex */
public final class nbw extends mzk {
    private static final mzv A;
    private static final nab B;
    private static final nab C;
    private static final nab D;
    private static final nab E;
    private static final mzv F;
    private static final nab G;
    private static final nab H;
    private static final mzv I;
    private static final nab J;
    private static final nab K;
    private static final mzv L;
    private static final nab M;
    private static final nab N;
    private static final nab O;
    private static final nab P;
    public static final nbw a = new nbw();
    static final /* synthetic */ ome[] c;
    public static final okq d;
    private static final List e;
    private static final nab f;
    private static final mzv g;
    private static final nab h;
    private static final nab i;
    private static final nab j;
    private static final mzv k;
    private static final mzv l;
    private static final nab m;
    private static final nab n;
    private static final nab o;
    private static final nab p;
    private static final nab q;
    private static final nab r;
    private static final mzv s;
    private static final mzv t;
    private static final mzv u;
    private static final mzv v;
    private static final mzv w;
    private static final List x;
    private static final nab y;
    private static final mzv z;

    static {
        List q2;
        mzv c2;
        mzv c3;
        mzp g2;
        mzv c4;
        mzv c5;
        mzp g3;
        mzv c6;
        mzp g4;
        mzp g5;
        ojc b;
        mzv c7;
        olo oloVar = new olo(nbw.class, "nullLiteral", "getNullLiteral()Lcom/google/intelligence/trieste/query/parser/Parser;", 0);
        int i2 = olr.a;
        c = new ome[]{oloVar, new olo(nbw.class, "booleanLiteral", "getBooleanLiteral()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "numericLiteral", "getNumericLiteral()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "singleQuoteStringLiteral", "getSingleQuoteStringLiteral()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "doubleQuoteStringLiteral", "getDoubleQuoteStringLiteral()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "stringLiteral", "getStringLiteral()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "identifier", "getIdentifier()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "columnIdentifier", "getColumnIdentifier()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "tableIdentifier", "getTableIdentifier()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "functionCall", "getFunctionCall()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "castExpression", "getCastExpression()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "captureVariable", "getCaptureVariable()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "expressionList", "getExpressionList()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "subQuery", "getSubQuery()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "primaryExpression", "getPrimaryExpression()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "unaryOperatorExpression", "getUnaryOperatorExpression()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "binaryOperatorExpression", "getBinaryOperatorExpression()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "expression", "getExpression()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "aliasedExpression", "getAliasedExpression()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "selectable", "getSelectable()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "joinConstraint", "getJoinConstraint()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "tableOrSubQuery", "getTableOrSubQuery()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "joinClause", "getJoinClause()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "whereClause", "getWhereClause()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "expressionIndex", "getExpressionIndex()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "expressionOrIndex", "getExpressionOrIndex()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "groupByClause", "getGroupByClause()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "havingClause", "getHavingClause()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "selectSource", "getSelectSource()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "selectCore", "getSelectCore()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "compoundSelect", "getCompoundSelect()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "ordering", "getOrdering()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "orderByClause", "getOrderByClause()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "limitClause", "getLimitClause()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "selectClause", "getSelectClause()Lcom/google/intelligence/trieste/query/parser/Parser;", 0), new olo(nbw.class, "topLevel", "getTopLevel()Lcom/google/intelligence/trieste/query/parser/TransformParser;", 0)};
        nah[] values = nah.values();
        oll.e(values, "<this>");
        Iterable ojpVar = values.length == 0 ? ojr.a : new ojp(values, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : ojpVar) {
            Integer valueOf = Integer.valueOf(((nah) obj).E);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(valueOf, arrayList);
                obj2 = arrayList;
            }
            ((List) obj2).add(obj);
        }
        Collection values2 = new TreeMap(linkedHashMap).values();
        oll.d(values2, "values().asIterable().gr…ce }.toSortedMap().values");
        oll.e(values2, "<this>");
        if (values2 instanceof Collection) {
            int size = values2.size();
            if (size == 0) {
                q2 = ojr.a;
            } else if (size != 1) {
                oll.e(values2, "<this>");
                q2 = new ArrayList(values2);
            } else {
                q2 = nxp.n(values2 instanceof List ? ((List) values2).get(0) : values2.iterator().next());
            }
        } else {
            oll.e(values2, "<this>");
            ArrayList arrayList2 = new ArrayList();
            nxp.x(values2, arrayList2);
            q2 = nxp.q(arrayList2);
        }
        e = q2;
        nab l2 = mzw.l(mzx.a("NULL"), nbp.g);
        nbw nbwVar = a;
        ome[] omeVarArr = c;
        g(l2, nbwVar, omeVarArr[0]);
        f = l2;
        mzi c8 = mzw.c(mzw.l(mzx.a("TRUE"), kls.l), mzw.l(mzx.a("FALSE"), kls.m));
        f(c8, nbwVar, omeVarArr[1]);
        g = c8;
        nab l3 = mzw.l(mzw.j("((0[xX][0-9a-fA-F]+)|([-+]?(([0-9]+\\.?[0-9]*)|(\\.[0-9]+))([eE][+-]?[0-9]+)?))", new omv[0]), nbp.h);
        g(l3, nbwVar, omeVarArr[2]);
        h = l3;
        nab l4 = mzw.l(mzw.j("'([^']*(''[^']*)*)'(?!')", new omv[0]), nbp.o);
        g(l4, nbwVar, omeVarArr[3]);
        i = l4;
        nab l5 = mzw.l(mzw.j("\"([^\"]*(\"\"[^\"]*)*)\"(?!\")", new omv[0]), kls.r);
        g(l5, nbwVar, omeVarArr[4]);
        j = l5;
        e(l4, omeVarArr[3]);
        e(l5, omeVarArr[4]);
        mzi c9 = mzw.c(l4, l5);
        f(c9, nbwVar, omeVarArr[5]);
        k = c9;
        mzv u2 = nbwVar.u(nby.a);
        f(u2, nbwVar, omeVarArr[6]);
        l = u2;
        nab l6 = mzw.l(mzx.c(nbwVar.q(), ".", 3), kls.p);
        g(l6, nbwVar, omeVarArr[7]);
        m = l6;
        nab l7 = mzw.l(mzx.c(nbwVar.q(), ".", 2), nbp.p);
        g(l7, nbwVar, omeVarArr[8]);
        n = l7;
        nas[] values3 = nas.values();
        ArrayList arrayList3 = new ArrayList(values3.length);
        for (nas nasVar : values3) {
            nab n2 = mzw.n(mzw.l(mzx.a(nasVar.name()), new klr(nasVar, 17)), mzx.b);
            c7 = mzx.c(mzw.f(new oln(a) { // from class: nbo
                @Override // defpackage.oln
                public final Object b() {
                    nbw nbwVar2 = nbw.a;
                    return ((nbw) this.b).h();
                }
            }), ",", null);
            arrayList3.add(mzw.i(n2, mzx.b(mzw.h(c7))));
        }
        nab l8 = mzw.l(mzw.a(arrayList3), kls.u);
        nbw nbwVar2 = a;
        g(l8, nbwVar2, c[9]);
        o = l8;
        mzm d2 = mzw.d(mzx.a("CAST"), mzx.b);
        nab n3 = mzw.n(mzw.n(mzw.n(mzw.f(new oln(nbwVar2) { // from class: nbm
            @Override // defpackage.oln
            public final Object b() {
                nbw nbwVar3 = nbw.a;
                return ((nbw) this.b).h();
            }
        }), mzx.a), mzx.a("AS")), mzx.a);
        nbx[] values4 = nbx.values();
        ArrayList arrayList4 = new ArrayList(values4.length);
        for (nbx nbxVar : values4) {
            arrayList4.add(mzw.l(mzx.a(nbxVar.f), new klr(nbxVar, 16)));
        }
        nab l9 = mzw.l(mzw.m(d2, mzx.b(mzw.i(n3, mzw.a(arrayList4)))), kls.o);
        nbw nbwVar3 = a;
        ome[] omeVarArr2 = c;
        g(l9, nbwVar3, omeVarArr2[10]);
        p = l9;
        nab l10 = mzw.l(mzw.j("\\?([0-9a-zA-Z_]*)", new omv[0]), kls.n);
        g(l10, nbwVar3, omeVarArr2[11]);
        q = l10;
        c2 = mzx.c(mzw.f(new oln(nbwVar3) { // from class: nbn
            @Override // defpackage.oln
            public final Object b() {
                nbw nbwVar4 = nbw.a;
                return ((nbw) this.b).h();
            }
        }), ",", null);
        nab l11 = mzw.l(mzx.b(c2), kls.t);
        g(l11, nbwVar3, omeVarArr2[12]);
        r = l11;
        mzv b2 = mzx.b(mzw.f(new oln(nbwVar3) { // from class: nbr
            @Override // defpackage.oln
            public final Object b() {
                nbw nbwVar4 = nbw.a;
                return ((nbw) this.b).j();
            }
        }));
        f(b2, nbwVar3, omeVarArr2[13]);
        s = b2;
        nab nabVar = f;
        e(nabVar, omeVarArr2[0]);
        mzv mzvVar = g;
        d(mzvVar, omeVarArr2[1]);
        mzi c10 = mzw.c(nabVar, mzvVar);
        nab nabVar2 = h;
        e(nabVar2, omeVarArr2[2]);
        mzi b3 = mzw.b(c10, nabVar2);
        mzv mzvVar2 = k;
        d(mzvVar2, omeVarArr2[5]);
        mzi b4 = mzw.b(b3, mzvVar2);
        nab nabVar3 = o;
        e(nabVar3, omeVarArr2[9]);
        mzi c11 = mzw.c(b4, nabVar3);
        e(l9, omeVarArr2[10]);
        mzi b5 = mzw.b(c11, l9);
        nab nabVar4 = m;
        e(nabVar4, omeVarArr2[7]);
        mzi b6 = mzw.b(mzw.b(mzw.b(mzw.b(mzw.b(b5, nabVar4), nbwVar3.m()), mzx.b(mzw.f(new oln(nbwVar3) { // from class: nbq
            @Override // defpackage.oln
            public final Object b() {
                nbw nbwVar4 = nbw.a;
                return ((nbw) this.b).h();
            }
        }))), nbwVar3.s()), nbwVar3.n());
        f(b6, nbwVar3, omeVarArr2[14]);
        t = b6;
        d(b6, omeVarArr2[14]);
        ncc[] values5 = ncc.values();
        ArrayList arrayList5 = new ArrayList();
        for (ncc nccVar : values5) {
            mzv s2 = nbl.a[nccVar.ordinal()] == 1 ? a.s() : mzw.f(new oln(a) { // from class: nbv
                @Override // defpackage.oln
                public final Object b() {
                    nbw nbwVar4 = nbw.a;
                    return ((nbw) this.b).l();
                }
            });
            List<mzv> w2 = a.w(nccVar);
            ArrayList arrayList6 = new ArrayList(nxp.u(w2));
            for (mzv mzvVar3 : w2) {
                arrayList6.add(mzw.l(mzw.i(mzw.n(mzvVar3, mzx.b), s2), nbp.r));
            }
            nxp.t(arrayList5, arrayList6);
        }
        mzi c12 = mzw.c(b6, mzw.a(arrayList5));
        nbw nbwVar4 = a;
        f(c12, nbwVar4, c[15]);
        u = c12;
        List<List> list = e;
        mzv l12 = nbwVar4.l();
        for (List<nah> list2 : list) {
            ArrayList<ojc> arrayList7 = new ArrayList(nxp.u(list2));
            for (nah nahVar : list2) {
                int ordinal = nahVar.ordinal();
                if (ordinal == 18 || ordinal == 19) {
                    nbw nbwVar5 = a;
                    b = oix.b(nahVar, mzw.b(mzw.c(nbwVar5.s(), nbwVar5.n()), nbwVar5.m()));
                } else {
                    b = oix.b(nahVar, l12);
                }
                arrayList7.add(b);
            }
            ArrayList arrayList8 = new ArrayList();
            for (ojc ojcVar : arrayList7) {
                mzv mzvVar4 = (mzv) ojcVar.b;
                List<mzv> w3 = a.w((nah) ojcVar.a);
                ArrayList arrayList9 = new ArrayList(nxp.u(w3));
                for (mzv mzvVar5 : w3) {
                    arrayList9.add(mzw.i(mzw.n(mzvVar5, mzx.b), mzvVar4));
                }
                nxp.t(arrayList8, arrayList9);
            }
            g5 = mzw.g(mzw.m(mzx.b, mzw.a(arrayList8)), null);
            l12 = mzw.l(mzw.i(l12, g5), kls.k);
        }
        nbw nbwVar6 = a;
        ome[] omeVarArr3 = c;
        f(l12, nbwVar6, omeVarArr3[16]);
        v = l12;
        d(l12, omeVarArr3[16]);
        f(l12, nbwVar6, omeVarArr3[17]);
        w = l12;
        x = nxp.y(new String[]{"LEFT", "OUTER", "CROSS", "INNER"});
        nab l13 = mzw.l(nbwVar6.v(nbwVar6.h()), kls.j);
        g(l13, nbwVar6, omeVarArr3[18]);
        y = l13;
        e(l13, omeVarArr3[18]);
        mzi c13 = mzw.c(l13, mzw.l(mzw.k("*"), nbp.n));
        f(c13, nbwVar6, omeVarArr3[19]);
        z = c13;
        nab l14 = mzw.l(mzw.m(mzw.d(mzx.a("ON"), mzx.b), nbwVar6.h()), nbp.d);
        mzm d3 = mzw.d(mzx.a("USING"), mzx.b);
        c3 = mzx.c(nbwVar6.q(), ",", null);
        mzi c14 = mzw.c(l14, mzw.l(mzw.m(d3, mzx.b(c3)), nbp.e));
        f(c14, nbwVar6, omeVarArr3[20]);
        A = c14;
        nab nabVar5 = n;
        e(nabVar5, omeVarArr3[8]);
        nab l15 = mzw.l(nbwVar6.v(mzw.b(mzw.b(mzw.b(mzw.c(nabVar5, mzx.b(mzw.f(new oln(nbwVar6) { // from class: nbs
            @Override // defpackage.oln
            public final Object b() {
                nbw nbwVar7 = nbw.a;
                return ((nbw) this.b).j();
            }
        }))), mzx.b(mzw.f(new oln(nbwVar6) { // from class: nbt
            @Override // defpackage.oln
            public final Object b() {
                nbw nbwVar7 = nbw.a;
                return ((nbw) this.b).i();
            }
        }))), mzx.b(mzw.f(new oln(nbwVar6) { // from class: nbu
            @Override // defpackage.oln
            public final Object b() {
                nbw nbwVar7 = nbw.a;
                return ((nbw) this.b).k();
            }
        }))), nbwVar6.m())), nbp.q);
        g(l15, nbwVar6, omeVarArr3[21]);
        B = l15;
        mzv k2 = nbwVar6.k();
        mzs i3 = mzw.i(mzw.n(mzw.m(mzx.b, mzw.a(nbwVar6.x(nxp.y(naz.values())))), mzx.b), nbwVar6.k());
        mzm mzmVar = mzx.b;
        d(c14, omeVarArr3[20]);
        g2 = mzw.g(mzw.o(i3, mzw.h(mzw.m(mzmVar, c14))), null);
        nab l16 = mzw.l(mzw.i(k2, g2), nbp.c);
        g(l16, nbwVar6, omeVarArr3[22]);
        C = l16;
        nab l17 = mzw.l(mzw.i(mzw.n(mzw.n(mzw.n(nbwVar6.i(), mzx.a), mzx.a("WHERE")), mzx.a), nbwVar6.h()), nbp.s);
        g(l17, nbwVar6, omeVarArr3[23]);
        D = l17;
        nab l18 = mzw.l(mzw.j("((0[xX][0-9a-fA-F]+)|([-+]?[0-9]+))(?!\\.)", new omv[0]), kls.s);
        g(l18, nbwVar6, omeVarArr3[24]);
        E = l18;
        mzv m2 = nbwVar6.m();
        e(l18, omeVarArr3[24]);
        mzi b7 = mzw.b(mzw.c(m2, l18), nbwVar6.h());
        f(b7, nbwVar6, omeVarArr3[25]);
        F = b7;
        nab n4 = mzw.n(mzw.n(mzw.n(mzw.n(mzw.n(mzw.c(nbwVar6.t(), nbwVar6.i()), mzx.a), mzx.a("GROUP")), mzx.a), mzx.a("BY")), mzx.a);
        c4 = mzx.c(nbwVar6.o(), ",", null);
        nab l19 = mzw.l(mzw.i(n4, c4), nbp.b);
        g(l19, nbwVar6, omeVarArr3[26]);
        G = l19;
        nab l20 = mzw.l(mzw.i(mzw.n(mzw.n(mzw.n(nbwVar6.p(), mzx.a), mzx.a("HAVING")), mzx.a), nbwVar6.h()), nbp.a);
        g(l20, nbwVar6, omeVarArr3[27]);
        H = l20;
        e(l20, omeVarArr3[27]);
        mzi b8 = mzw.b(mzw.c(mzw.c(l20, nbwVar6.p()), nbwVar6.t()), nbwVar6.i());
        f(b8, nbwVar6, omeVarArr3[28]);
        I = b8;
        mzm d4 = mzw.d(mzx.a("SELECT"), mzx.a);
        d(c13, omeVarArr3[19]);
        c5 = mzx.c(c13, ",", null);
        nab m3 = mzw.m(d4, c5);
        mzm d5 = mzw.d(mzw.d(mzx.a, mzx.a("FROM")), mzx.a);
        d(b8, omeVarArr3[28]);
        nab l21 = mzw.l(mzw.i(m3, mzw.h(mzw.m(d5, b8))), nbp.m);
        g(l21, nbwVar6, omeVarArr3[29]);
        J = l21;
        mzv r2 = nbwVar6.r();
        g3 = mzw.g(mzw.i(mzw.n(mzw.m(mzx.a, mzw.a(nbwVar6.x(nxp.y(nam.values())))), mzx.a), nbwVar6.r()), null);
        nab l22 = mzw.l(mzw.i(r2, g3), kls.q);
        g(l22, nbwVar6, omeVarArr3[30]);
        K = l22;
        mzi c15 = mzw.c(mzw.l(mzx.a("ASC"), nbp.j), mzw.l(mzx.a("DESC"), nbp.k));
        f(c15, nbwVar6, omeVarArr3[31]);
        L = c15;
        mzm d6 = mzw.d(mzw.d(mzw.d(mzx.a("ORDER"), mzx.a), mzx.a("BY")), mzx.a);
        mzv o2 = nbwVar6.o();
        mzm mzmVar2 = mzx.a;
        d(c15, omeVarArr3[31]);
        c6 = mzx.c(mzw.i(o2, mzw.h(mzw.m(mzmVar2, c15))), ",", null);
        nab l23 = mzw.l(mzw.m(d6, c6), nbp.i);
        g(l23, nbwVar6, omeVarArr3[32]);
        M = l23;
        nab l24 = mzw.l(mzw.i(mzw.m(mzw.d(mzx.a("LIMIT"), mzx.a), nbwVar6.h()), mzw.h(mzw.m(mzw.d(mzw.d(mzx.a, mzx.a("OFFSET")), mzx.a), nbwVar6.h()))), nbp.f);
        g(l24, nbwVar6, omeVarArr3[33]);
        N = l24;
        e(l22, omeVarArr3[30]);
        mzm mzmVar3 = mzx.a;
        e(l23, omeVarArr3[32]);
        mzs i4 = mzw.i(l22, mzw.h(mzw.m(mzmVar3, l23)));
        mzm mzmVar4 = mzx.a;
        e(l24, omeVarArr3[33]);
        nab l25 = mzw.l(mzw.o(i4, mzw.h(mzw.m(mzmVar4, l24))), nbp.l);
        g(l25, nbwVar6, omeVarArr3[34]);
        O = l25;
        nab m4 = mzw.m(mzx.b, nbwVar6.j());
        g4 = mzw.g(mzw.m(mzx.b, mzw.k(";")), null);
        nab n5 = mzw.n(mzw.n(mzw.n(m4, mzw.e(g4)), mzx.b), mzw.a);
        g(n5, nbwVar6, omeVarArr3[35]);
        P = n5;
        d = mzx.d(nbwVar6);
        mzx.d(mzw.n(nbwVar6.h(), mzw.a));
    }

    private nbw() {
    }

    private final mzv m() {
        nab nabVar = q;
        e(nabVar, c[11]);
        return nabVar;
    }

    private final mzv n() {
        nab nabVar = r;
        e(nabVar, c[12]);
        return nabVar;
    }

    private final mzv o() {
        mzv mzvVar = F;
        d(mzvVar, c[25]);
        return mzvVar;
    }

    private final mzv p() {
        nab nabVar = G;
        e(nabVar, c[26]);
        return nabVar;
    }

    private final mzv q() {
        mzv mzvVar = l;
        d(mzvVar, c[6]);
        return mzvVar;
    }

    private final mzv r() {
        nab nabVar = J;
        e(nabVar, c[29]);
        return nabVar;
    }

    private final mzv s() {
        mzv mzvVar = s;
        d(mzvVar, c[13]);
        return mzvVar;
    }

    private final mzv t() {
        nab nabVar = D;
        e(nabVar, c[23]);
        return nabVar;
    }

    private final mzv u(Collection collection) {
        String w2 = nxp.w(collection, "|", null, null, null, 62);
        return mzw.j("((?!(" + w2 + ")($|[^a-z0-9_]))[a-z_][a-z0-9_]*)", omv.IGNORE_CASE);
    }

    private final mzv v(mzv mzvVar) {
        return mzw.i(mzvVar, mzw.h(mzw.c(mzw.m(mzw.d(mzw.d(mzx.a, mzx.a("AS")), mzx.a), q()), mzw.m(mzx.a, u(nxp.s(nby.a, x))))));
    }

    private final List w(nbd nbdVar) {
        mzv j2;
        List a2 = nbdVar.a();
        ArrayList arrayList = new ArrayList(nxp.u(a2));
        lta listIterator = ((llp) a2).listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            int i2 = 0;
            while (true) {
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    if (!Character.isLetter(charAt) && charAt != ' ') {
                        j2 = mzw.k(str);
                        break;
                    }
                    i2++;
                } else {
                    String l2 = ols.l(str, " ", "\\s+");
                    j2 = mzw.j("(" + l2 + ")(?![a-zA-Z0-9_])", omv.IGNORE_CASE);
                    break;
                }
            }
            arrayList.add(mzw.l(j2, new klr(nbdVar, 18)));
        }
        return arrayList;
    }

    private final List x(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nxp.t(arrayList, a.w((nbd) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.mzk
    public final /* bridge */ /* synthetic */ mzv c() {
        nab nabVar = P;
        e(nabVar, c[35]);
        return nabVar;
    }

    public final mzv h() {
        mzv mzvVar = w;
        d(mzvVar, c[17]);
        return mzvVar;
    }

    public final mzv i() {
        nab nabVar = C;
        e(nabVar, c[22]);
        return nabVar;
    }

    public final mzv j() {
        nab nabVar = O;
        e(nabVar, c[34]);
        return nabVar;
    }

    public final mzv k() {
        nab nabVar = B;
        e(nabVar, c[21]);
        return nabVar;
    }

    public final mzv l() {
        mzv mzvVar = u;
        d(mzvVar, c[15]);
        return mzvVar;
    }
}

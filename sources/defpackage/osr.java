package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: osr  reason: default package */
/* loaded from: classes2.dex */
public final class osr {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public osr() {
        this.d = ost.o;
    }

    public osr(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    public osr(byte[] bArr, byte[] bArr2) {
        int i = chc.s;
        this.a = jdg.V(atk.NORMAL);
    }

    public osr(char[] cArr) {
    }

    public osr(short[] sArr) {
    }

    public final oqi a() {
        if (this.c == null) {
            throw new IllegalStateException("url == null");
        }
        return new oqi(this, null);
    }

    public final void b(String str, String str2) {
        ((mlu) this.d).I(str, str2);
    }

    public final void c(String str, String str2) {
        ((mlu) this.d).H(str, str2);
    }

    public final void d(opx opxVar) {
        this.d = opxVar.h();
    }

    public final void e(String str, oqj oqjVar) {
        if (str != null) {
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (oqjVar == null || ofb.e(str)) {
                if (oqjVar == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
                    throw new IllegalArgumentException("method " + str + " must have a request body.");
                }
                this.e = str;
                this.b = oqjVar;
                return;
            }
            throw new IllegalArgumentException("method " + str + " must not have a request body.");
        }
        throw new NullPointerException("method == null");
    }

    public final void f(String str) {
        ((mlu) this.d).G(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jzm] */
    /* JADX WARN: Type inference failed for: r3v0, types: [mks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, jux] */
    public final jyj h() {
        ?? r3;
        Object obj;
        ?? r5;
        ?? r1 = this.e;
        if (r1 == 0 || (r3 = this.d) == 0 || (obj = this.c) == null || (r5 = this.a) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.e == null) {
                sb.append(" scheduler");
            }
            if (this.d == null) {
                sb.append(" controlExecutor");
            }
            if (this.c == null) {
                sb.append(" downloadFetcher");
            }
            if (this.a == null) {
                sb.append(" downloadQueue");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jyj(r1, (jza) this.b, r3, (jws) obj, r5);
    }

    public final void i(mks mksVar) {
        if (mksVar != null) {
            this.d = mksVar;
            return;
        }
        throw new NullPointerException("Null controlExecutor");
    }

    public final void j(jzm jzmVar) {
        if (jzmVar != null) {
            this.e = jzmVar;
            return;
        }
        throw new NullPointerException("Null scheduler");
    }

    public final ipz k() {
        return new ipz(this, null);
    }

    public final void l(List list, lex lexVar) {
        ArrayList arrayList = new ArrayList();
        if (!((String) this.a).isEmpty()) {
            arrayList.add(this.a);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ipz ipzVar = (ipz) it.next();
            lex lexVar2 = ipz.a;
            if (!ipzVar.d.isEmpty()) {
                arrayList.add(ipzVar.d);
            }
            String[] strArr = ipzVar.e;
            if (strArr.length > 0) {
                this.b = (String[]) lre.e((Object[]) this.b, strArr, String.class);
            }
        }
        this.a = lexVar.f(arrayList);
        if (arrayList.size() > 1) {
            this.a = String.format("(%s)", this.a);
        }
    }

    public final void m(String str, ipy ipyVar, String... strArr) {
        l(lre.H(Arrays.asList(ipz.c(str, ipyVar, strArr)), hwy.j), ipz.a);
    }

    public final void n(int i) {
        this.d = String.valueOf(i);
    }

    public final void o(String str, boolean z) {
        if (z) {
            str = String.valueOf(str).concat(" DESC");
        }
        this.c = str;
    }

    public final void p(String str, ipy ipyVar, String... strArr) {
        int length = strArr.length;
        if (length <= 0) {
            throw new IllegalArgumentException("Values array needs to have at least 1 element.");
        }
        ipy ipyVar2 = ipy.EQUAL;
        switch (ipyVar.ordinal()) {
            case 6:
                Object[] objArr = new Object[2];
                objArr[0] = str;
                StringBuilder sb = new StringBuilder("(");
                for (int i = 0; i < length; i++) {
                    sb.append("?");
                    if (i != length - 1) {
                        sb.append(",");
                    }
                }
                sb.append(")");
                objArr[1] = sb.toString();
                this.a = String.format("%s IN %s", objArr);
                break;
            case 7:
                if (length != 2) {
                    throw new IllegalArgumentException(String.format("Operator 'BETWEEN' needs 2 values, but actually %d value(s).", Integer.valueOf(length)));
                }
                this.a = String.format("%s BETWEEN ? AND ?", str);
                break;
            case 8:
                if (length > 2) {
                    throw new IllegalArgumentException(String.format("Operator 'LIKE' needs 1 or 2 values, but actually %d values.", Integer.valueOf(length)));
                }
                if (length == 1) {
                    this.a = String.format("%s LIKE ?", str);
                    break;
                } else {
                    this.a = String.format("%s LIKE ? ESCAPE ?", str);
                    break;
                }
            case 9:
                if (length > 1) {
                    throw new IllegalArgumentException(String.format("Operator 'GLOB' needs 1 value, but actually %d values.", Integer.valueOf(length)));
                }
                this.a = String.format("%s GLOB ?", str);
                break;
            case 10:
                if (length > 1) {
                    throw new IllegalArgumentException(String.format("Operator 'FIND_IN_SET' needs 1 value, but actually %d values.", Integer.valueOf(length)));
                }
                this.a = String.format("(',' || %s || ',') LIKE ?", str);
                String str2 = strArr[0];
                strArr[0] = "%," + str2 + ",%";
                break;
            case 11:
                if (length == 4) {
                    this.a = String.format("(%s + ?) %% ? BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER)", str);
                    break;
                } else {
                    throw new IllegalArgumentException(String.format("Operator 'DELTA_MOD_BETWEEN' needs 4 values, but actually %d values.", Integer.valueOf(length)));
                }
            default:
                if (length > 1) {
                    throw new IllegalArgumentException(String.format("Operator '%s' only supports 1 value.", ipyVar.m));
                }
                this.a = String.format("%s%s?", str, ipyVar.m);
                break;
        }
        this.b = strArr;
    }

    public final void q(String str) {
        o(str, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final void s(String str, long j) {
        x().a.put(str, Long.valueOf(j));
    }

    public final coq t() {
        Object obj;
        Object obj2 = this.d;
        if (obj2 == null || (obj = this.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" contentType");
            }
            if (this.e == null) {
                sb.append(" callbackInfo");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new coq((col) obj2, (coo) this.b, (cop) this.a, (com) this.c, (cok) obj);
    }

    public final void u(col colVar) {
        if (colVar != null) {
            this.d = colVar;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [leq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [leq, java.lang.Object] */
    public final chc v() {
        if (this.e != null) {
            if (this.b != null) {
                if (this.d == null) {
                    throw new IllegalStateException("pendingClickTracker is missing");
                }
                Object obj = this.e;
                return new chc((View) obj, this.b, this.c, (dxs) this.d, this.a, null, null);
            }
            throw new IllegalStateException("imageConverter is missing");
        }
        throw new IllegalStateException("view is missing");
    }

    public final void w(atk atkVar) {
        this.a = jdg.V(atkVar);
    }

    public final boe x() {
        if (this.e == null) {
            this.e = ipt.j();
        }
        return (boe) this.e;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("url == null");
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:".concat(String.valueOf(str.substring(3)));
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:".concat(String.valueOf(str.substring(4)));
        }
        this.c = opz.n(str);
    }

    public osr(byte[] bArr) {
        this.a = Collections.emptyMap();
        this.e = "GET";
        this.d = new mlu((byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ngz, java.lang.Object] */
    public final ipb r() {
        if (this.c == null && this.b == null) {
            throw new IllegalArgumentException("message and protoBytes should not be both null. If you want to build the item for update, please use buildForUpdate() instead.");
        }
        Object obj = this.e;
        if (obj != null) {
            this.d = ((boe) obj).A();
        } else if (this.d == null) {
            this.d = ipt.j().A();
        }
        Object obj2 = this.a;
        if (obj2 == null) {
            throw new IllegalStateException("Missing required properties: tableName");
        }
        return new ipb((String) obj2, (ipt) this.d, this.c, (byte[]) this.b);
    }

    public osr(oqi oqiVar) {
        Object linkedHashMap;
        this.a = Collections.emptyMap();
        this.c = oqiVar.a;
        this.e = oqiVar.b;
        this.b = oqiVar.d;
        if (oqiVar.e.isEmpty()) {
            linkedHashMap = Collections.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap(oqiVar.e);
        }
        this.a = linkedHashMap;
        this.d = oqiVar.c.h();
    }
}

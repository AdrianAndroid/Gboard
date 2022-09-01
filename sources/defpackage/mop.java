package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.List;

/* compiled from: PG */
/* renamed from: mop  reason: default package */
/* loaded from: classes2.dex */
public final class mop {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public mop() {
    }

    public mop(jwr jwrVar, juc jucVar, File file) {
        this.c = jwrVar;
        this.a = jucVar;
        this.b = file;
    }

    public /* synthetic */ mop(kdr kdrVar, Context context, boe boeVar, byte[] bArr) {
        this.a = kdrVar;
        this.c = context;
        this.b = boeVar;
    }

    public mop(krb krbVar, Object[] objArr, String str) {
        this.c = krbVar;
        this.b = objArr;
        this.a = str;
    }

    public mop(moq moqVar, nwc nwcVar, oir oirVar, byte[] bArr) {
        this.c = moqVar;
        this.a = nwcVar;
        this.b = oirVar;
    }

    public mop(pf pfVar, String str, pi piVar) {
        this.c = pfVar;
        this.a = str;
        this.b = piVar;
    }

    public final synchronized nwk a(List list) {
        nwk nwkVar;
        Object obj = this.a;
        Object obj2 = this.c;
        nwkVar = new nwk((nwc) obj, ((moq) obj2).d, list, ((moq) obj2).g, ((moq) obj2).e, null);
        ((oir) this.b).b(nwkVar.b);
        return nwkVar;
    }

    public final void b(String str, File file, Exception exc) {
        jsr o = ((juc) this.a).o();
        jtr e = ((juc) this.a).e();
        String message = exc.getMessage();
        jrh jrhVar = (jrh) o;
        String str2 = jrhVar.a;
        long length = file.length();
        jrz a = jsf.a(str2);
        String str3 = jrhVar.b;
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(length);
        if (message == null) {
            message = "";
        }
        objArr[1] = message;
        a.b(str3, "download_failed", objArr);
        ((jwr) this.c).i.e.a(new jpk(o, str, e, exc, 3));
    }

    public final jav c(String str) {
        return kdr.f(((kdr) this.a).b(str), (boe) this.b);
    }

    public final void d() {
        Integer num;
        Object obj = this.c;
        Object obj2 = this.a;
        pf pfVar = (pf) obj;
        if (!pfVar.e.contains(obj2) && (num = (Integer) pfVar.c.remove(obj2)) != null) {
            pfVar.b.remove(num);
        }
        pfVar.f.remove(obj2);
        if (pfVar.g.containsKey(obj2)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + ((String) obj2) + ": " + pfVar.g.get(obj2));
            pfVar.g.remove(obj2);
        }
        String str = (String) obj2;
        if (pfVar.h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + pfVar.h.getParcelable(str));
            pfVar.h.remove(str);
        }
        if (((fx) pfVar.d.get(obj2)) == null) {
            return;
        }
        throw null;
    }
}

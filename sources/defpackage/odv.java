package defpackage;

import com.google.android.inputmethod.latin.R;
import java.util.ArrayDeque;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: odv  reason: default package */
/* loaded from: classes2.dex */
public final class odv {
    public final Object a;
    public boolean b;
    public Object c;

    public odv(blw blwVar) {
        this.b = false;
        this.a = blwVar;
    }

    public odv(Object obj) {
        this.a = obj;
    }

    public odv(byte[] bArr) {
        this.a = new Object();
    }

    public odv(char[] cArr) {
        this.a = new gpq();
    }

    public odv(short[] sArr) {
        this.b = false;
        this.c = null;
        this.a = null;
    }

    private static gqh k(boolean z) {
        gqe a = gqh.a();
        a.i("default_entry");
        a.f(z ? R.drawable.f50720_resource_name_obfuscated_res_0x7f080373 : R.drawable.f50730_resource_name_obfuscated_res_0x7f080374);
        a.d(true != z ? R.string.f159340_resource_name_obfuscated_res_0x7f1405cf : R.string.f149440_resource_name_obfuscated_res_0x7f140116);
        a.k(true != z ? -40000 : -40001, null);
        a.b("layout", Integer.valueOf((int) R.layout.f145280_resource_name_obfuscated_res_0x7f0e053a));
        a.b("default", true);
        return a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Future, java.lang.Object] */
    public final Future a() {
        this.b = true;
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Future future) {
        synchronized (this.a) {
            if (!this.b) {
                this.c = future;
            }
        }
    }

    public final void c(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (!z) {
            d();
            ((gqk) this.a).a(2);
        } else if (this.c != null) {
        } else {
            ((gqk) this.a).a(0);
            gsb gsbVar = new gsb(this, null);
            this.c = gsbVar;
            gsbVar.g(mjl.a);
        }
    }

    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            ((gqo) obj).h();
            this.c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    public final void e(geo geoVar) {
        synchronized (this.a) {
            if (this.c == null) {
                this.c = new ArrayDeque();
            }
            this.c.add(geoVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final void f(gen genVar) {
        geo geoVar;
        synchronized (this.a) {
            if (this.c != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.a) {
                        geoVar = (geo) this.c.poll();
                        if (geoVar == null) {
                            this.b = false;
                            return;
                        }
                    }
                    geoVar.b(genVar);
                }
            }
        }
    }

    public final synchronized void g(gpq gpqVar) {
        Object obj = this.a;
        if (((gpq) obj).c == 0 && ((gpq) obj).b == 0) {
            ((gpq) obj).a(gpqVar.b, gpqVar.c);
        }
        Object obj2 = this.a;
        if (((gpq) obj2).c != gpqVar.c || ((gpq) obj2).b != gpqVar.b) {
            ((ltd) ((ltd) dgz.f.d()).k("com/google/android/apps/inputmethod/libs/handwriting/recognition/AbstractHandwritingRecognizerWrapper$RecognitionState", "addStrokes", 313, "AbstractHandwritingRecognizerWrapper.java")).K("Current writing guide does not agree with writing guide of new strokes: (%d, %d) != (%d, %d)", Integer.valueOf(((gpq) this.a).b), Integer.valueOf(((gpq) this.a).c), Integer.valueOf(gpqVar.b), Integer.valueOf(gpqVar.c));
        }
        ((gpq) this.a).addAll(gpqVar);
        this.b = true;
    }

    public final synchronized void h() {
        Object obj = this.c;
        if (obj != null && !((AtomicBoolean) ((kcq) obj).a).get()) {
            ((AtomicBoolean) ((kcq) this.c).c).set(true);
        }
        this.b = false;
        ((gpq) this.a).clear();
        ((gpq) this.a).a(0, 0);
    }

    public final synchronized void i(String str) {
        ((gpq) this.a).e = str;
        this.b = true;
    }

    public final synchronized kcq j() {
        if (this.b && !((gpq) this.a).isEmpty()) {
            kcq kcqVar = new kcq((gpq) this.a);
            this.c = kcqVar;
            this.b = false;
            kcq kcqVar2 = kcqVar;
            return kcqVar;
        }
        return null;
    }

    public odv() {
        this.a = new gqk(R.id.key_pos_header_access_points_menu, "default_entry", k(false), k(true));
    }
}

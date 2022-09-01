package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmmgesture.HmmGestureDecoder;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dkk  reason: default package */
/* loaded from: classes.dex */
public abstract class dkk implements AutoCloseable {
    public HmmGestureDecoder a;
    public djh b;
    protected boolean c;
    public final Context d;
    protected final ino e;
    protected final hlu f;
    private boolean g;
    private boolean i;
    private boolean h = true;
    private mrm j = null;

    public dkk(Context context, hlu hluVar, ino inoVar) {
        this.d = context;
        this.f = hluVar;
        this.e = inoVar;
    }

    protected abstract HmmGestureDecoder a();

    public final void b() {
        HmmGestureDecoder hmmGestureDecoder = this.a;
        if (hmmGestureDecoder != null) {
            hmmGestureDecoder.close();
            this.a = null;
        }
    }

    public void c() {
        this.c = j(this.e);
        this.i = i(this.e);
        if (this.e.aj(R.string.f160840_resource_name_obfuscated_res_0x7f140674)) {
            HmmGestureDecoder a = a();
            this.a = a;
            mrm mrmVar = this.j;
            if (mrmVar == null) {
                return;
            }
            a.c(26, mrmVar);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b();
    }

    protected void d(boolean z) {
    }

    protected void e() {
    }

    public void f() {
        this.g = false;
        HmmGestureDecoder hmmGestureDecoder = this.a;
        if (hmmGestureDecoder != null) {
            hmmGestureDecoder.a();
        }
    }

    protected void g(HmmGestureDecoder hmmGestureDecoder, mrm mrmVar) {
        hmmGestureDecoder.c(26, mrmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(defpackage.hfd r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkk.h(hfd):boolean");
    }

    protected boolean i(ino inoVar) {
        return inoVar.aj(R.string.f160820_resource_name_obfuscated_res_0x7f140672);
    }

    protected boolean j(ino inoVar) {
        return inoVar.aj(R.string.f160860_resource_name_obfuscated_res_0x7f140676);
    }
}

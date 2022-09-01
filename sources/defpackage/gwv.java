package defpackage;

import android.os.Looper;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gwv  reason: default package */
/* loaded from: classes.dex */
public final class gwv {
    public Object a;
    public Object b;

    public gwv() {
        this.a = new hnj[0];
    }

    private gwv(Runnable runnable) {
        this.a = runnable;
    }

    public gwv(byte[] bArr) {
    }

    public static gwv a(Runnable runnable, Executor executor) {
        gwv gwvVar = new gwv(runnable);
        ija a = ijf.a(new fqa(gwvVar, 19), gwz.c);
        gwvVar.b = a;
        a.e(executor);
        return gwvVar;
    }

    public final boolean b(hnl hnlVar) {
        hnj[] hnjVarArr = (hnj[]) this.a;
        int length = hnjVarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                hnj hnjVar = hnjVarArr[i];
                if (hnlVar.a != hnjVar && hnjVar.fo(hnlVar)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        hnlVar.a();
        return z;
    }

    public final fny c() {
        if (this.a == null) {
            this.a = new fgy();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new fny((fgy) this.a, (Looper) this.b, null);
    }

    public final boolean d(hqt hqtVar, Runnable runnable) {
        if (ino.M(hqtVar.a()).aj(R.string.f162630_resource_name_obfuscated_res_0x7f140728)) {
            return true;
        }
        this.b = runnable;
        guc.a.a(hqtVar.a(), "PrivacyTerm");
        return false;
    }

    public final eeq e() {
        if (this.b == null || this.a == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" query");
            }
            if (this.a == null) {
                sb.append(" searchQueryType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new eeq((String) this.b, (mba) this.a);
    }

    public final void f(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null query");
    }

    public final void g(mba mbaVar) {
        if (mbaVar != null) {
            this.a = mbaVar;
            return;
        }
        throw new NullPointerException("Null searchQueryType");
    }
}

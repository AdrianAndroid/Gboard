package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hvd  reason: default package */
/* loaded from: classes.dex */
public final class hvd implements hvf {
    public final Context a;
    public hvc b;
    public hvc c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private boolean e;
    private boolean f;

    public hvd(Context context) {
        this.a = context;
    }

    @Override // defpackage.hvf
    public final void a(Rect rect) {
    }

    @Override // defpackage.hvf
    public final void b() {
        hvc hvcVar = this.b;
        if (hvcVar != null) {
            jbt.I(this.a, hvcVar);
        }
        hvc hvcVar2 = this.c;
        if (hvcVar2 != null) {
            jbt.I(this.a, hvcVar2);
        }
    }

    @Override // defpackage.hvf
    public final boolean c() {
        if (jam.r(this.a)) {
            return this.e || this.f;
        }
        return false;
    }

    public final hvc d(String str) {
        hvc hvcVar = new hvc(this, this.d, str);
        if (jbt.H(this.a, Settings.Secure.getUriFor(str), false, hvcVar)) {
            return hvcVar;
        }
        return null;
    }

    public final void e(ContentResolver contentResolver, String str) {
        char c;
        int hashCode = str.hashCode();
        boolean z = false;
        if (hashCode != -377350077) {
            if (hashCode == 527873560 && str.equals("quick_reply")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("gb_boosting")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            if (Settings.Secure.getInt(contentResolver, str, 0) == 1) {
                z = true;
            }
            this.e = z;
        } else if (c == 1) {
            if (Settings.Secure.getInt(contentResolver, str, 0) == 1) {
                z = true;
            }
            this.f = z;
        } else {
            int i = hve.a;
        }
    }
}

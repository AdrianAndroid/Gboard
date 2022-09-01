package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: PG */
/* renamed from: gjx  reason: default package */
/* loaded from: classes.dex */
final class gjx implements gjq {
    public static volatile gjx a;
    public static final Object b = new Object();
    public final Context c;
    private lfb d = ldu.a;
    private final Object e = new Object();
    private final fpp f;

    public gjx(Context context, fpp fppVar, byte[] bArr, byte[] bArr2) {
        this.c = context.getApplicationContext();
        this.f = fppVar;
    }

    @Override // defpackage.gjq
    public final boolean a() {
        boolean booleanValue;
        synchronized (this.e) {
            booleanValue = this.d.e() ? ((Boolean) this.d.a()).booleanValue() : b();
        }
        return booleanValue;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.e) {
            try {
                try {
                    z = true;
                    if (Settings.Global.getInt(((Context) this.f.a).getContentResolver(), "multi_cb") != 1) {
                        z = false;
                    }
                    this.d = lfb.g(Boolean.valueOf(z));
                } catch (Settings.SettingNotFoundException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}

package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;

/* compiled from: PG */
/* renamed from: irz  reason: default package */
/* loaded from: classes.dex */
public final class irz extends ContentObserver {
    public static final iry a;
    public volatile boolean c;
    public volatile boolean d;
    public boolean e;
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/statusmonitors/UserSetupCompleteMonitor");
    public static final irz b = new irz();

    static {
        iry iryVar = new iry();
        a = iryVar;
        ijf.g("UserSetupComplete", iryVar);
    }

    private irz() {
        super(null);
    }

    public final boolean a() {
        if (!this.c && !this.d) {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/statusmonitors/UserSetupCompleteMonitor", "isUserSetupComplete", 153, "UserSetupCompleteMonitor.java")).t("This method should be called after startMonitor!");
        }
        return this.c;
    }

    public final boolean b(ContentResolver contentResolver) {
        if (!this.c) {
            boolean z = false;
            if (Settings.Secure.getInt(contentResolver, "user_setup_complete", 0) != 0 || jam.y()) {
                z = true;
            }
            if (z) {
                this.c = true;
                ijf.j(a);
                if (this.e) {
                    contentResolver.unregisterContentObserver(this);
                    return true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        super.onChange(z);
        gyc.b.execute(new idx(this, guw.a().getContentResolver(), 11));
    }
}

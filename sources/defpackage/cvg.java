package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: cvg  reason: default package */
/* loaded from: classes.dex */
public final class cvg extends BroadcastReceiver implements AutoCloseable {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiAvatarObserver");
    private final Context b;
    private final cvf c;
    private final Runnable d;
    private boolean e;

    private cvg(Context context, Runnable runnable) {
        this.b = context;
        this.d = runnable;
        this.c = new cvf(runnable);
    }

    public static cvg a(Context context, Runnable runnable) {
        cvg cvgVar = new cvg(context, runnable);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
        intentFilter.addDataScheme("package");
        intentFilter.addDataSchemeSpecificPart("com.bitstrips.imoji", 0);
        cvgVar.b.registerReceiver(cvgVar, intentFilter);
        cvgVar.b();
        return cvgVar;
    }

    private final synchronized void b() {
        if (!this.e && jam.H(this.b)) {
            boolean H = jbt.H(this.b, cvo.a().appendPath("me").build(), false, this.c);
            this.e = H;
            if (H) {
                return;
            }
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiAvatarObserver", "registerContentObserver", 70, "BitmojiAvatarObserver.java")).t("Failed to register Bitmoji content observer");
        }
    }

    private final synchronized void c() {
        if (!this.e) {
            return;
        }
        this.e = false;
        if (jbt.I(this.b, this.c)) {
            return;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiAvatarObserver", "unregisterContentObserver", 83, "BitmojiAvatarObserver.java")).t("Failed to unregister Bitmoji content observer");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.unregisterReceiver(this);
        c();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            b();
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
            c();
            this.d.run();
        } else if (!"android.intent.action.PACKAGE_DATA_CLEARED".equals(intent.getAction())) {
        } else {
            this.d.run();
        }
    }
}

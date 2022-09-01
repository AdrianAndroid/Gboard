package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kjd  reason: default package */
/* loaded from: classes.dex */
public final class kjd implements kja {
    public static kjd a;
    public final Context b;
    private final ContentObserver c;

    public kjd() {
        this.b = null;
        this.c = null;
    }

    public kjd(Context context) {
        this.b = context;
        kjc kjcVar = new kjc();
        this.c = kjcVar;
        context.getContentResolver().registerContentObserver(gfp.a, true, kjcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c() {
        Context context;
        synchronized (kjd.class) {
            kjd kjdVar = a;
            if (kjdVar != null && (context = kjdVar.b) != null && kjdVar.c != null) {
                context.getContentResolver().unregisterContentObserver(a.c);
            }
            a = null;
        }
    }

    @Override // defpackage.kja
    /* renamed from: b */
    public final String a(final String str) {
        Context context = this.b;
        if (context != null && !gkm.c(context)) {
            try {
                return (String) kki.c(new kiz() { // from class: kjb
                    @Override // defpackage.kiz
                    public final Object a() {
                        kjd kjdVar = kjd.this;
                        return gfp.d(kjdVar.b.getContentResolver(), str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }
}

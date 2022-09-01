package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: kjw  reason: default package */
/* loaded from: classes.dex */
public final class kjw implements kja {
    private static final Map a = new qo();
    private final SharedPreferences b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b() {
        synchronized (kjw.class) {
            Map map = a;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                kjw kjwVar = (kjw) it.next();
                SharedPreferences sharedPreferences = kjwVar.b;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = kjwVar.c;
                throw null;
            }
            map.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kjw c() {
        kjw kjwVar;
        if (!gkm.e()) {
            synchronized (kjw.class) {
                kjwVar = (kjw) a.get(null);
                if (kjwVar == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return kjwVar;
        }
        throw null;
    }

    @Override // defpackage.kja
    public final Object a(String str) {
        throw null;
    }
}

package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: arz  reason: default package */
/* loaded from: classes.dex */
public final class arz implements anb {
    private static final Set a = new HashSet();

    @Override // defpackage.anb
    public final void a(String str, Throwable th) {
        Set set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }
}

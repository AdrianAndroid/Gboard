package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bac  reason: default package */
/* loaded from: classes.dex */
public final class bac implements azn {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final azn b;

    public bac(azn aznVar) {
        this.b = aznVar;
    }

    @Override // defpackage.azn
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.azn
    public final /* bridge */ /* synthetic */ fws b(Object obj, int i, int i2, ava avaVar) {
        return this.b.b(new aze(((Uri) obj).toString()), i, i2, avaVar);
    }
}

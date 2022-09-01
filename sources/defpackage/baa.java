package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: baa  reason: default package */
/* loaded from: classes.dex */
public final class baa implements azn {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    private final azz b;

    public baa(azz azzVar) {
        this.b = azzVar;
    }

    @Override // defpackage.azn
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.azn
    public final /* bridge */ /* synthetic */ fws b(Object obj, int i, int i2, ava avaVar) {
        Uri uri = (Uri) obj;
        return new fws(new bfu(uri), this.b.a(uri));
    }
}

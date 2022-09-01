package defpackage;

import java.net.URI;

/* compiled from: PG */
/* renamed from: oab  reason: default package */
/* loaded from: classes2.dex */
public final class oab extends nuy {
    @Override // defpackage.nut
    public final /* bridge */ /* synthetic */ nux a(URI uri, nur nurVar) {
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            jdg.Q(path, "targetPath");
            jdg.D(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
            String substring = path.substring(1);
            uri.getAuthority();
            return new oaa(substring, nurVar, oao.o, lga.b(), nxp.O(getClass().getClassLoader()));
        }
        return null;
    }

    @Override // defpackage.nut
    public final String b() {
        return "dns";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nuy
    public final void c() {
    }

    @Override // defpackage.nuy
    public final void d() {
    }
}

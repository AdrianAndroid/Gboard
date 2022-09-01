package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: gog  reason: default package */
/* loaded from: classes.dex */
public final class gog implements lgb {
    final /* synthetic */ goh a;

    public gog(goh gohVar) {
        this.a = gohVar;
    }

    @Override // defpackage.lgb
    /* renamed from: b */
    public final InputStream a() {
        lty ltyVar = luh.a;
        try {
            goh gohVar = this.a;
            return (InputStream) gohVar.j.c(gohVar.h).a;
        } catch (IOException e) {
            this.a.j.a();
            throw new RuntimeException("Error creating input stream", e);
        }
    }
}

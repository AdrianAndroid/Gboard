package defpackage;

/* compiled from: PG */
/* renamed from: nya  reason: default package */
/* loaded from: classes2.dex */
public final class nya {
    public final ntv a;
    public nuc b;
    public nud c;
    final /* synthetic */ oqv d;

    public nya(oqv oqvVar, ntv ntvVar, byte[] bArr, byte[] bArr2) {
        this.d = oqvVar;
        this.a = ntvVar;
        nud a = ((nue) oqvVar.a).a((String) oqvVar.b);
        this.c = a;
        if (a == null) {
            throw new IllegalStateException("Could not find policy '" + ((String) oqvVar.b) + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }
        this.b = a.a(ntvVar);
    }
}

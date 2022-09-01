package defpackage;

/* compiled from: PG */
/* renamed from: ngq  reason: default package */
/* loaded from: classes2.dex */
final class ngq implements ngx {
    public static final ngq a = new ngq(1);
    private final /* synthetic */ int b;

    public ngq(int i) {
        this.b = i;
    }

    @Override // defpackage.ngx
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return nfm.class.isAssignableFrom(cls);
        }
        return false;
    }

    @Override // defpackage.ngx
    public final ngw a(Class cls) {
        if (this.b != 0) {
            if (!nfm.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
            }
            try {
                Class asSubclass = cls.asSubclass(nfm.class);
                nfm nfmVar = (nfm) nfm.cP.get(asSubclass);
                if (nfmVar == null) {
                    try {
                        Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                        nfmVar = (nfm) nfm.cP.get(asSubclass);
                    } catch (ClassNotFoundException e) {
                        throw new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                if (nfmVar == null) {
                    nfmVar = (nfm) ((nfm) nih.g(asSubclass)).N(6);
                    if (nfmVar == null) {
                        throw new IllegalStateException();
                    }
                    nfm.cP.put(asSubclass, nfmVar);
                }
                return (ngw) nfmVar.N(3);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
            }
        }
        throw new IllegalStateException("This should never be called.");
    }
}

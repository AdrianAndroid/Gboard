package defpackage;

/* compiled from: PG */
/* renamed from: nir  reason: default package */
/* loaded from: classes2.dex */
final class nir extends nfb {
    public nir() {
        super(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.nfb
    public final ngt c(ngz ngzVar, int i) {
        char c;
        String name = ngzVar.getClass().getName();
        int hashCode = name.hashCode();
        if (hashCode == 106185) {
            if (name.equals("kig")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 109180) {
            switch (hashCode) {
                case 109141:
                    if (name.equals("nkr")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109142:
                    if (name.equals("nks")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 109143:
                    if (name.equals("nkt")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } else {
            if (name.equals("nlz")) {
                c = 3;
            }
            c = 65535;
        }
        if (c == 0) {
            switch (i) {
                case 293000:
                    return nkv.g;
                case 293100:
                    return nkl.g;
                case 293101:
                    return nkk.d;
                case 294000:
                    return nkq.m;
                case 294500:
                    return nna.l;
                case 27423252:
                    return nku.d;
                case 29735924:
                    return nkz.d;
                case 47096292:
                    return nkr.b;
                case 77499489:
                    return nkm.d;
                case 307792803:
                    return nkx.n;
                default:
                    return null;
            }
        } else if (c == 1) {
            switch (i) {
                case 1253625:
                    return nmy.f;
                case 29737259:
                    return nla.b;
                case 171993426:
                    return nmz.d;
                case 443278602:
                    return nky.c;
                default:
                    return null;
            }
        } else if (c == 2) {
            if (i == 112997213) {
                return nlb.d;
            }
            return null;
        } else if (c == 3) {
            if (i == 420374974) {
                return nlh.f;
            }
            return null;
        } else if (c != 4 || i != 334728578) {
            return null;
        } else {
            return kin.i;
        }
    }
}

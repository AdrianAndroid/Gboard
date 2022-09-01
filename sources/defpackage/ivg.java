package defpackage;

/* compiled from: PG */
/* renamed from: ivg  reason: default package */
/* loaded from: classes.dex */
public final class ivg implements ipi {
    private final /* synthetic */ int a;
    private final nfm b;

    public ivg(eeu eeuVar, int i) {
        this.a = i;
        this.b = eeuVar;
    }

    public ivg(mxa mxaVar, int i) {
        this.a = i;
        this.b = mxaVar;
    }

    @Override // defpackage.ipv
    public final long a(String str, long j) {
        if (this.a != 0) {
            if (((str.hashCode() == -2127020710 && str.equals("selection_hint")) ? (char) 0 : (char) 65535) == 0) {
                eeu eeuVar = (eeu) this.b;
                if ((eeuVar.a & 1) != 0) {
                    return eeuVar.b;
                }
            }
        }
        return 0L;
    }

    @Override // defpackage.ipv
    public final nem b(String str, nem nemVar) {
        return nemVar;
    }

    @Override // defpackage.ipv
    public final boolean d(String str) {
        return false;
    }

    @Override // defpackage.ipv
    public final double e(String str) {
        return 0.0d;
    }

    @Override // defpackage.ipv
    public final int f(String str) {
        return 0;
    }

    @Override // defpackage.ipv
    public final float g(String str) {
        return 0.0f;
    }

    @Override // defpackage.ipv
    public final int h(String str) {
        char c = 65535;
        if (this.a != 0) {
            if (str.hashCode() == 740705876 && str.equals("gboard_version_code")) {
                c = 0;
            }
            if (c == 0) {
                eeu eeuVar = (eeu) this.b;
                if ((eeuVar.a & 16) != 0) {
                    return eeuVar.f;
                }
            }
            return 0;
        }
        int hashCode = str.hashCode();
        if (hashCode != -929008000) {
            if (hashCode == 740705876 && str.equals("gboard_version_code")) {
                c = 1;
            }
        } else if (str.equals("field_id")) {
            c = 0;
        }
        if (c == 0) {
            mxa mxaVar = (mxa) this.b;
            if ((mxaVar.a & 64) != 0) {
                return mxaVar.h;
            }
        } else if (c == 1) {
            mxa mxaVar2 = (mxa) this.b;
            if ((mxaVar2.a & 2048) != 0) {
                return mxaVar2.m;
            }
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0067, code lost:
        if (r9.equals("package_name") != false) goto L20;
     */
    @Override // defpackage.ipv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String i(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivg.i(java.lang.String):java.lang.String");
    }

    @Override // defpackage.ipv
    public final boolean c(String str, ngf ngfVar) {
        char c = 65535;
        if (this.a != 0) {
            int hashCode = str.hashCode();
            if (hashCode != -2127020710) {
                if (hashCode != -2091510221) {
                    if (hashCode == 740705876 && str.equals("gboard_version_code")) {
                        c = 2;
                    }
                } else if (str.equals("language_tag")) {
                    c = 1;
                }
            } else if (str.equals("selection_hint")) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2 && ngfVar == ngf.INT && (((eeu) this.b).a & 16) != 0) {
                        return true;
                    }
                } else if (ngfVar == ngf.STRING && (((eeu) this.b).a & 8) != 0) {
                    return true;
                }
            } else if (ngfVar == ngf.LONG && (((eeu) this.b).a & 1) != 0) {
                return true;
            }
            return false;
        }
        switch (str.hashCode()) {
            case -1877165340:
                if (str.equals("package_name")) {
                    c = 1;
                    break;
                }
                break;
            case -929008000:
                if (str.equals("field_id")) {
                    c = 0;
                    break;
                }
                break;
            case -918657975:
                if (str.equals("klp_locales")) {
                    c = 4;
                    break;
                }
                break;
            case 338410841:
                if (str.equals("locales")) {
                    c = 3;
                    break;
                }
                break;
            case 740705876:
                if (str.equals("gboard_version_code")) {
                    c = 2;
                    break;
                }
                break;
            case 1995486635:
                if (str.equals("klp_versions")) {
                    c = 5;
                    break;
                }
                break;
            case 2057198454:
                if (str.equals("experiment_ids")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (ngfVar == ngf.INT && (((mxa) this.b).a & 64) != 0) {
                    return true;
                }
                break;
            case 1:
                if (ngfVar == ngf.STRING && (((mxa) this.b).a & 256) != 0) {
                    return true;
                }
                break;
            case 2:
                if (ngfVar == ngf.INT && (((mxa) this.b).a & 2048) != 0) {
                    return true;
                }
                break;
            case 3:
                if (ngfVar == ngf.STRING && ((mxa) this.b).n.size() != 0) {
                    return true;
                }
                break;
            case 4:
                if (ngfVar == ngf.STRING && ((mxa) this.b).q.size() != 0) {
                    return true;
                }
                break;
            case 5:
                if (ngfVar == ngf.STRING && ((mxa) this.b).r.size() != 0) {
                    return true;
                }
                break;
            case 6:
                if (ngfVar == ngf.STRING && ((mxa) this.b).t.size() != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}

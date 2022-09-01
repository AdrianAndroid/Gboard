package defpackage;

/* compiled from: PG */
/* renamed from: chy  reason: default package */
/* loaded from: classes.dex */
public final class chy extends cjo {
    public final mse a;
    public final cqp c;
    public final Object d;
    public final ats e;
    public final lfb f;
    public final lfb g;
    public final boolean h;
    private volatile transient String i;

    public chy(mse mseVar, cqp cqpVar, Object obj, ats atsVar, lfb lfbVar, lfb lfbVar2, boolean z) {
        if (mseVar != null) {
            this.a = mseVar;
            if (cqpVar != null) {
                this.c = cqpVar;
                if (obj != null) {
                    this.d = obj;
                    if (atsVar != null) {
                        this.e = atsVar;
                        if (lfbVar != null) {
                            this.f = lfbVar;
                            if (lfbVar2 != null) {
                                this.g = lfbVar2;
                                this.h = z;
                                return;
                            }
                            throw new NullPointerException("Null alternativeCandidates");
                        }
                        throw new NullPointerException("Null stickerPackId");
                    }
                    throw new NullPointerException("Null candidateRequest");
                }
                throw new NullPointerException("Null glideModel");
            }
            throw new NullPointerException("Null image");
        }
        throw new NullPointerException("Null candidate");
    }

    @Override // defpackage.cjo, defpackage.cci
    public final mse b() {
        return this.a;
    }

    @Override // defpackage.cjo
    public final ats c() {
        return this.e;
    }

    @Override // defpackage.cjo
    public final cqp d() {
        return this.c;
    }

    @Override // defpackage.cjo
    public final lfb e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjo) {
            cjo cjoVar = (cjo) obj;
            if (this.a.equals(cjoVar.b()) && this.c.equals(cjoVar.d()) && this.d.equals(cjoVar.g()) && this.e.equals(cjoVar.c()) && this.f.equals(cjoVar.f()) && this.g.equals(cjoVar.e()) && this.h == cjoVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cjo
    public final lfb f() {
        return this.f;
    }

    @Override // defpackage.cjo
    public final Object g() {
        return this.d;
    }

    @Override // defpackage.cjo, defpackage.cja
    public final boolean h() {
        return this.h;
    }

    @Override // defpackage.cjo
    public final kqg j() {
        return new kqg(this);
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.c.toString();
        String obj3 = this.d.toString();
        String obj4 = this.e.toString();
        String obj5 = this.g.toString();
        boolean z = this.h;
        return "ImageCandidateData{candidate=" + obj + ", image=" + obj2 + ", glideModel=" + obj3 + ", candidateRequest=" + obj4 + ", stickerPackId=Optional.absent(), alternativeCandidates=" + obj5 + ", isExpressionMoment=" + z + "}";
    }

    public final int hashCode() {
        mse mseVar = this.a;
        int i = mseVar.cO;
        if (i == 0) {
            i = nhh.a.b(mseVar).b(mseVar);
            mseVar.cO = i;
        }
        return (true != this.h ? 1237 : 1231) ^ ((((((((((((i ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:10:0x0014, B:18:0x0026, B:19:0x0029, B:20:0x0045, B:23:0x004c, B:24:0x0053, B:26:0x0034, B:27:0x0041, B:28:0x0054), top: B:4:0x0005 }] */
    @Override // defpackage.cjo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String i() {
        /*
            r3 = this;
            java.lang.String r0 = r3.i
            if (r0 != 0) goto L59
            monitor-enter(r3)
            java.lang.String r0 = r3.i     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L54
            mse r0 = r3.a     // Catch: java.lang.Throwable -> L56
            int r1 = r0.c     // Catch: java.lang.Throwable -> L56
            int r1 = defpackage.msc.b(r1)     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L14
            r1 = 1
        L14:
            int r1 = r1 + (-1)
            r2 = 22
            if (r1 == r2) goto L41
            r2 = 28
            if (r1 == r2) goto L41
            r2 = 25
            if (r1 == r2) goto L41
            r2 = 26
            if (r1 == r2) goto L41
            switch(r1) {
                case 17: goto L34;
                case 18: goto L41;
                case 19: goto L41;
                default: goto L29;
            }     // Catch: java.lang.Throwable -> L56
        L29:
            cqp r0 = r3.c     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r0.n()     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = defpackage.lfd.d(r0)     // Catch: java.lang.Throwable -> L56
            goto L45
        L34:
            java.lang.String r0 = defpackage.cjo.o(r0)     // Catch: java.lang.Throwable -> L56
            r1 = 95
            r2 = 32
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L56
            goto L45
        L41:
            java.lang.String r0 = defpackage.cjo.o(r0)     // Catch: java.lang.Throwable -> L56
        L45:
            r3.i = r0     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r3.i     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L4c
            goto L54
        L4c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "similarItemsQuery() cannot return null"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L56
            throw r0     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L56
            throw r0
        L59:
            java.lang.String r0 = r3.i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chy.i():java.lang.String");
    }
}

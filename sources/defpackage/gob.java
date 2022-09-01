package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gob  reason: default package */
/* loaded from: classes.dex */
public class gob extends gnz {
    protected final gnx b;
    private final goc c;
    private final mox d;
    private final String e;
    private final bmc f;
    private final blq g;
    private final gpa h;

    public gob(goc gocVar, mox moxVar, String str, bmc bmcVar, blq blqVar, gpa gpaVar, gnx gnxVar) {
        super("PairHttpUp");
        this.c = gocVar;
        jdg.u(moxVar);
        this.d = moxVar;
        jdg.u(str);
        this.e = str;
        jdg.u(bmcVar);
        this.f = bmcVar;
        this.g = blqVar;
        this.h = gpaVar;
        this.b = gnxVar;
    }

    private final mko g(blw blwVar) {
        try {
            return this.f.c(d(this.d, this.e, 37), blwVar, this.g);
        } catch (MalformedURLException e) {
            ((ltd) ((ltd) goc.a.d()).k("com/google/android/libraries/gsa/s3/PairHttpConnection$Upload", "connect", 486, "PairHttpConnection.java")).G("Malformed URL '%s' with suffix '%s'", this.d.b, this.e);
            bnh.a();
            throw new bna(e, 65538);
        }
    }

    protected boolean b(gou gouVar) {
        final nks a;
        gpd a2 = this.h.a();
        do {
            a();
            a = a2.a();
            a();
            if (a != null) {
                if (a.cR == -1) {
                    a.cR = nhh.a.b(a).a(a);
                }
                boolean z = a.e;
                jdg.F(!gouVar.c);
                final int i = a.cR;
                if (i == -1) {
                    i = nhh.a.b(a).a(a);
                    a.cR = i;
                }
                gouVar.b.g(i + 4, new bmo() { // from class: got
                    @Override // defpackage.bmo
                    public final void a(ByteBuffer byteBuffer) {
                        int i2 = i;
                        nks nksVar = a;
                        int i3 = gou.d;
                        byteBuffer.putInt(i2);
                        try {
                            nksVar.ii(Cnew.ak(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i2));
                            byteBuffer.position(byteBuffer.position() + i2);
                        } catch (IOException e) {
                            throw new AssertionError(e);
                        }
                    }
                });
                if (z && !gouVar.c) {
                    gouVar.b.f(blj.a);
                    gouVar.c = true;
                }
            }
            if (a == null) {
                break;
            }
        } while (!a.e);
        return true;
    }

    @Override // defpackage.gnz
    public final void e() {
        mko mkoVar;
        bna e;
        mko mkoVar2 = null;
        gov govVar = null;
        gov govVar2 = null;
        boolean z = true;
        try {
            try {
                a();
                bmt.a(7);
                bmp bmpVar = new bmp(this.f.a());
                gou gouVar = new gou(bmpVar, this.d.e);
                mkoVar = g(bmpVar);
                try {
                    bmt.a(8);
                    a();
                    boolean b = b(gouVar);
                    if (!b) {
                        return;
                    }
                    try {
                        bmt.a(23);
                        a();
                        try {
                            bmj bmjVar = (bmj) bvq.g(mkoVar);
                            try {
                                gof.a(bmjVar.c(), "Upload");
                                a();
                                int i = 0;
                                try {
                                    try {
                                        gov govVar3 = new gov(bma.a(bmjVar.a()));
                                        while (true) {
                                            try {
                                                a();
                                                nkt a = govVar3.a();
                                                jdg.u(a);
                                                i++;
                                                if (i == 1) {
                                                    this.c.d(1);
                                                }
                                                this.b.d(a);
                                                int i2 = a.a;
                                                int ab = ndb.ab(i2);
                                                if (ab != 0 && ab == 3) {
                                                    break;
                                                }
                                                int ab2 = ndb.ab(i2);
                                                if (ab2 != 0 && ab2 == 2) {
                                                    break;
                                                }
                                            } catch (IOException e2) {
                                                e = e2;
                                                govVar2 = govVar3;
                                                a();
                                                if (i > 0) {
                                                    ((ltd) ((ltd) ((ltd) goc.a.d()).i(e)).k("com/google/android/libraries/gsa/s3/PairHttpConnection$Upload", "readResponses", (char) 561, "PairHttpConnection.java")).t("[Upload] exception - exit");
                                                    throw new bna(e, 65549);
                                                }
                                                lyz.a(govVar2);
                                                goc.b(mkoVar);
                                            } catch (Throwable th) {
                                                th = th;
                                                govVar = govVar3;
                                                lyz.a(govVar);
                                                throw th;
                                            }
                                        }
                                        lyz.a(govVar3);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                }
                                goc.b(mkoVar);
                            } catch (blb e4) {
                                throw new bna(e4, 65545);
                            }
                        } catch (ExecutionException e5) {
                            ((ltd) ((ltd) ((ltd) goc.a.d()).i(e5)).k("com/google/android/libraries/gsa/s3/PairHttpConnection$Upload", "runImpl", (char) 458, "PairHttpConnection.java")).t("Connecting to the up stream failed unexpectedly.");
                            bnh.b(e5);
                            throw new bna(e5, 65586);
                        }
                    } catch (bna e6) {
                        e = e6;
                        z = b;
                        this.b.b(e);
                        if (!z || mkoVar == null) {
                            return;
                        }
                        goc.b(mkoVar);
                    } catch (Throwable th3) {
                        th = th3;
                        z = b;
                        th = th;
                        mkoVar2 = mkoVar;
                        if (z && mkoVar2 != null) {
                            goc.b(mkoVar2);
                        }
                        throw th;
                    }
                } catch (bna e7) {
                    e = e7;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (bna e8) {
            mkoVar = null;
            e = e8;
        } catch (Throwable th5) {
            th = th5;
            if (z) {
                goc.b(mkoVar2);
            }
            throw th;
        }
    }
}

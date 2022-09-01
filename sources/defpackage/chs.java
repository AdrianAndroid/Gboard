package defpackage;

import android.content.Context;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.List;

/* compiled from: PG */
/* renamed from: chs  reason: default package */
/* loaded from: classes.dex */
public final class chs implements chx {
    protected final mkr a;
    public final File b;
    public final cqh c;
    public final cwx d;
    public final Context e;
    public final dpe f;

    public chs(Context context, cqh cqhVar, mkr mkrVar) {
        this.b = context.getFilesDir();
        this.a = mkrVar;
        this.c = cqhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static chr a(File file) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        chn chnVar = (chn) jan.b.a(file, (nhf) chn.f.N(7));
        int i11 = 0;
        if (chnVar != null) {
            if ((chnVar.a & 1) != 0) {
                cho choVar = chnVar.b;
                if (choVar == null) {
                    choVar = cho.b;
                }
                i8 = choVar.a.size();
            } else {
                i8 = 0;
            }
            if ((chnVar.a & 2) != 0) {
                chk chkVar = chnVar.c;
                if (chkVar == null) {
                    chkVar = chk.b;
                }
                i9 = chkVar.a.size();
            } else {
                i9 = 0;
            }
            if ((chnVar.a & 4) != 0) {
                chm chmVar = chnVar.d;
                if (chmVar == null) {
                    chmVar = chm.b;
                }
                i10 = chmVar.a.size();
            } else {
                i10 = 0;
            }
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (chq chqVar : chnVar.e) {
                if ((chqVar.a & 1) != 0) {
                    int p = efq.p(chqVar.b);
                    if (p == 0) {
                        p = 1;
                    }
                    int i15 = p - 1;
                    if (i15 == 1) {
                        i14 = chqVar.c.size();
                    } else if (i15 == 2) {
                        i11 = chqVar.c.size();
                    } else if (i15 == 3) {
                        i12 = chqVar.c.size();
                    } else if (i15 == 4) {
                        i13 = chqVar.c.size();
                    }
                }
            }
            i5 = i11;
            i = i8;
            i2 = i9;
            i3 = i10;
            i6 = i12;
            i7 = i13;
            i4 = i14;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        return new chr(file.length(), i, i2, i3, i4, i5, i6, i7);
    }

    public final chq b(int i) {
        cri b;
        nfh t = chq.d.t();
        int i2 = i - 1;
        if (i2 == 1) {
            b = cri.b(this.e, "recent_gifs_shared");
        } else if (i2 == 2) {
            b = cri.b(this.e, "recent_sticker_shared");
        } else if (i2 != 3) {
            b = cri.b(this.e, "recent_content_suggestion_shared");
        } else {
            b = cri.b(this.e, "recent_bitmoji_shared");
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        chq chqVar = (chq) t.b;
        chqVar.b = i2;
        chqVar.a |= 1;
        for (cqp cqpVar : (List) Collection$EL.stream(b.f(false)).filter(ccj.r).collect(Collectors.toCollection(cag.g))) {
            nfh t2 = chp.k.t();
            int b2 = cqpVar.b();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            chp chpVar = (chp) t2.b;
            chpVar.a |= 2;
            chpVar.c = b2;
            int c = cqpVar.c();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            chp chpVar2 = (chp) t2.b;
            chpVar2.a |= 1;
            chpVar2.b = c;
            String uri = cqpVar.d().toString();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            chp chpVar3 = (chp) t2.b;
            uri.getClass();
            chpVar3.a |= 4;
            chpVar3.d = uri;
            String str = "";
            String q = cqpVar.q() != null ? cqpVar.q() : str;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            chp chpVar4 = (chp) t2.b;
            q.getClass();
            chpVar4.a |= 8;
            chpVar4.e = q;
            String p = cqpVar.p() != null ? cqpVar.p() : str;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            chp chpVar5 = (chp) t2.b;
            p.getClass();
            chpVar5.a |= 16;
            chpVar5.f = p;
            if (cqpVar.n() != null) {
                str = cqpVar.n();
            }
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            chp chpVar6 = (chp) t2.b;
            str.getClass();
            chpVar6.a |= 32;
            chpVar6.g = str;
            String r = cqpVar.r();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            chp chpVar7 = (chp) t2.b;
            chpVar7.a |= 64;
            chpVar7.h = r;
            String o = cqpVar.o();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            chp chpVar8 = (chp) t2.b;
            chpVar8.a |= 128;
            chpVar8.i = o;
            mbr m = cqpVar.m();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            chp chpVar9 = (chp) t2.b;
            chpVar9.j = m.l;
            chpVar9.a |= 256;
            chp chpVar10 = (chp) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            chq chqVar2 = (chq) t.b;
            chpVar10.getClass();
            nga ngaVar = chqVar2.c;
            if (!ngaVar.c()) {
                chqVar2.c = nfm.H(ngaVar);
            }
            chqVar2.c.add(chpVar10);
        }
        return (chq) t.cz();
    }

    public chs(Context context, cqh cqhVar, mkr mkrVar, byte[] bArr) {
        this(context, cqhVar, mkrVar);
        this.f = new dpe(((knn) ((knl) context.getApplicationContext()).b()).g, (byte[]) null);
        this.d = cwo.a(context.getApplicationContext());
        this.e = context;
    }
}

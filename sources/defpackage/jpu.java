package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: PG */
/* renamed from: jpu  reason: default package */
/* loaded from: classes.dex */
public final class jpu implements jqa {
    public static final jpt a = new jps(0);
    private final jpt b;
    private final llp c;

    public jpu() {
    }

    public jpu(jpt jptVar, llp llpVar) {
        this.b = jptVar;
        this.c = llpVar;
    }

    public static jyu b() {
        return new jyu();
    }

    private static void c(mov movVar, jub jubVar, jtr jtrVar) {
        String h = movVar.h();
        try {
            jubVar.j(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", jpn.a).parse(h));
        } catch (ParseException e) {
            throw new jpz(String.format("Error parsing expiry date %s for superpack %s", h, jtrVar), e);
        }
    }

    private static void e(mov movVar, jpq jpqVar) {
        movVar.j();
        while (movVar.n()) {
            jpqVar.a(movVar.h());
        }
        movVar.l();
    }

    @Override // defpackage.jsj
    public final String d() {
        return "JsonManifestParser";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jpu) {
            jpu jpuVar = (jpu) obj;
            if (this.b.equals(jpuVar.b) && lre.I(this.c, jpuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return "JsonManifestParser{extraHandler=" + valueOf + ", indexSpecs=" + valueOf2 + "}";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:115:0x02fc
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // defpackage.jqa
    public final defpackage.jqm w(java.io.InputStream r21, java.lang.String r22, int r23) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpu.w(java.io.InputStream, java.lang.String, int):jqm");
    }
}

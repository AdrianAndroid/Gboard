package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m implements g {
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str) {
        this.a = str;
    }

    @Override // j$.time.format.g
    public final boolean a(r rVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        String replace = this.a.replace("'", "''");
        return "'" + replace + "'";
    }
}

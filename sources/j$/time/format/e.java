package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e implements g {
    private final char a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(char c) {
        this.a = c;
    }

    @Override // j$.time.format.g
    public final boolean a(r rVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}

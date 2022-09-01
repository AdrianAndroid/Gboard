package j$.nio.file;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class b extends IOException {
    private final String a;
    private final String b;

    public b(String str) {
        super((String) null);
        this.a = str;
        this.b = null;
    }

    public b(String str, String str2, String str3) {
        super(str3);
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.b;
        String str2 = this.a;
        if (str2 == null && str == null) {
            return super.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
        }
        if (str != null) {
            sb.append(" -> ");
            sb.append(str);
        }
        if (super.getMessage() != null) {
            sb.append(": ");
            sb.append(super.getMessage());
        }
        return sb.toString();
    }
}

package defpackage;

/* compiled from: PG */
/* renamed from: gym  reason: default package */
/* loaded from: classes.dex */
public enum gym implements ids {
    CONTENT_DATA_MANAGER_SHORTCUTS_RUN("ContentDataManager.Shortcuts.doInBackground-time"),
    CONTENT_DATA_MANAGER_CONTACTS_RUN("ContentDataManager.Contacts.doInBackground-time"),
    CONTENT_DATA_MANAGER_EMAILS_RUN("ContentDataManager.Emails.doInBackground-time");
    
    private final String e;

    gym(String str) {
        this.e = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.e;
    }
}

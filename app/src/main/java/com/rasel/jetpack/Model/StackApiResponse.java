package com.rasel.jetpack.Model;

import java.util.List;

public class StackApiResponse {
    public List<Item> items;
    public boolean has_more;
    public int backoff;
    public int quota_max;
    public int quota_remaining;
}